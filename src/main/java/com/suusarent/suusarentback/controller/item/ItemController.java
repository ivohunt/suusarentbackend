package com.suusarent.suusarentback.controller.item;

import com.suusarent.suusarentback.controller.category.dto.CategoryInfo;
import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import com.suusarent.suusarentback.infrastructure.error.ApiError;
import com.suusarent.suusarentback.persistence.category.CategoryEquipmentSizeDto;
import com.suusarent.suusarentback.service.CategoryService;
import com.suusarent.suusarentback.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    private final CategoryService categoryService;

    @PostMapping("/item-add")
    @Operation(summary = "Uue varustusühiku lisamine.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Ei tohi",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addItem(@RequestBody ItemDto itemDto) {
        itemService.addItem(itemDto);

    }

    @GetMapping("/item-add-get-categories")
    @Operation(summary = "Leiab andmebaasist kõik kategooriad ja tagastab tabelisse id, name ja price")
    public List<CategoryInfo> getCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/item-add-get-category-sizes")
    @Operation(summary = "Leiab andmebaasist valitud kategooria equipmentSizeName (suurusühiku) järgi")
    public void getCategorySize() {
        categoryService.getCategorySize();

    }
}
