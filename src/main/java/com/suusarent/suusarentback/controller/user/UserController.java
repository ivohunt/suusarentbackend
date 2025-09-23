package com.suusarent.suusarentback.controller.user;

import com.suusarent.suusarentback.controller.user.dto.UserDto;
import com.suusarent.suusarentback.infrastructure.error.ApiError;
import com.suusarent.suusarentback.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    @Operation(summary = "Uue kasutaja lisamine.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Sellise emailiga kasutaja on juba süsteemis olemas",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addUser(@RequestBody @Valid UserDto userDto) {
        userService.addUser(userDto);
    }


}
