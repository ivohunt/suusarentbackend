package com.suusarent.suusarentback.persistence.user;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.login.dto.LoginResponse;
import com.suusarent.suusarentback.controller.user.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.time.Instant;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, imports = {Status.class, Instant.class})
public interface UserMapper {


    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    LoginResponse toLoginResponse(User user);


    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "telephone", target = "phone")
    @Mapping(source = "password", target = "password")
    @Mapping(expression = "java(Status.ACTIVE.getCode())", target = "status")
    @Mapping(expression = "java(Instant.now())", target = "createdAt")
    User toUser(UserDto userDto);


}