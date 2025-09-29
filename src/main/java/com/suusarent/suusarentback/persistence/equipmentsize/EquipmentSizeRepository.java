package com.suusarent.suusarentback.persistence.equipmentsize;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipmentSizeRepository extends JpaRepository<EquipmentSize, Integer> {

    @Query("select e from EquipmentSize e where e.sizeType.id = :sizeTypeId order by e.sequence")
    List<EquipmentSize> findEquipmentSizesBy(Integer sizeTypeId);


}