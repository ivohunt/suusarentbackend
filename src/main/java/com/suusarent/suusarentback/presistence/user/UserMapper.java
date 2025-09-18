package com.suusarent.suusarentback.presistence.user;

import com.suusarent.suusarentback.controller.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {



    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "status", target = "status")
    LoginResponse toLoginResponse(User user);
}