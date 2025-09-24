package com.suusarent.suusarentback.controller.category;


import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.controller.category.dto.CategoryInfos;
import com.suusarent.suusarentback.controller.user.dto.SizeTypeInfo;
import com.suusarent.suusarentback.infrastructure.error.ApiError;
import com.suusarent.suusarentback.service.CategoryService;
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
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/category")
    @Operation(summary = "Uue kategooria lisamine.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Selline kategooria on juba süsteemis olemas",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addCategory(@RequestBody CategoryDto categoryDto) {
        categoryService.addCategory(categoryDto);
    }

    @GetMapping("/category/size-types")
    @Operation(summary = "Leiab andmebaasist suuruste tüübid ja tagastab koos size_type ja size_namega")
    public List<SizeTypeInfo> findSizeTypes() {
        return categoryService.findSizeTypes();
    }

    @GetMapping("/category")
    @Operation(summary = "Leiab andmebaasist kõik kategooriad ja tagastab tabelisse id, name ja price")
    public List<CategoryInfos> getCategories() {
        return categoryService.getCategories();
    }

    @DeleteMapping("/category")
    public void deleteCategory(@RequestParam Integer categoryId) {
       categoryService.deleteCategory(categoryId);
    }
}
