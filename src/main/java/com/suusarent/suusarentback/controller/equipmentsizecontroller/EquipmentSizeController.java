package com.suusarent.suusarentback.controller.equipmentsizecontroller;

import com.suusarent.suusarentback.controller.equipmentsizecontroller.dto.EquipmentSizeInfo;
import com.suusarent.suusarentback.service.EquipmentSizeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EquipmentSizeController {

    private final EquipmentSizeService equipmentSizeService;


    @GetMapping("/equipment-sizes/")
    @Operation(summary = "Leiab andmebaasist...")
    public List<EquipmentSizeInfo> getEquipmentSizes(@RequestParam Integer sizeTypeId) {
        return equipmentSizeService.getEquipmentSizes(sizeTypeId);
    }
}
