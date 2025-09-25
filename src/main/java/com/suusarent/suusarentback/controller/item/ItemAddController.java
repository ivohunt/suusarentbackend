package com.suusarent.suusarentback.controller.item;

import com.suusarent.suusarentback.controller.item.dto.ItemAddDto;
import com.suusarent.suusarentback.infrastructure.error.ApiError;
import com.suusarent.suusarentback.service.ItemAddService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemAddController {

    private final ItemAddService itemAddService;

    @PostMapping("/item-add")
    @Operation(summary = "Uue varustusühiku lisamine.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Ei tohi",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void itemAdd(@RequestBody ItemAddDto itemAddDto) {
        itemAddService.itemAdd(itemAddDto);

    }
}
