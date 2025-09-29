package com.suusarent.suusarentback.controller.item;

import com.suusarent.suusarentback.controller.category.dto.ItemCategoryDropdown;
import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import com.suusarent.suusarentback.infrastructure.error.ApiError;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSize;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSizeRepository;
import com.suusarent.suusarentback.service.CategoryService;
import com.suusarent.suusarentback.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/item-add")
    @Operation(summary = "Uue varustusühiku lisamine.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Ei tohi",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addItem(@RequestBody ItemDto itemDto) {
        itemService.addItem(itemDto);
    }




}
