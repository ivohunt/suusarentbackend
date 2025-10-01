package com.suusarent.suusarentback.controller.size;

import com.suusarent.suusarentback.controller.user.dto.SizeTypeInfo;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSizeRepository;
import com.suusarent.suusarentback.service.SizeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SizeController {

    private final SizeService sizeService;
    private final EquipmentSizeRepository equipmentSizeRepository;

    @GetMapping("/size-types")
    @Operation(summary = "Leiab andmebaasist suuruste tüübid (tagastab size_type_id ja size_type_name info")
    public List<SizeTypeInfo> findSizeTypes() {
        return sizeService.findSizeTypes();
    }


}
