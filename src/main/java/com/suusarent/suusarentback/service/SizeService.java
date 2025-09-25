package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.user.dto.SizeTypeInfo;
import com.suusarent.suusarentback.persistence.sizetype.SizeType;
import com.suusarent.suusarentback.persistence.sizetype.SizeTypeMapper;
import com.suusarent.suusarentback.persistence.sizetype.SizeTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SizeService {

    private final SizeTypeRepository sizeTypeRepository;
    private final SizeTypeMapper sizeTypeMapper;

    public List<SizeTypeInfo> findSizeTypes() {
        List<SizeType> sizeTypes = sizeTypeRepository.findAll();
        return sizeTypeMapper.toSizeTypeInfos(sizeTypes);
    }

}
