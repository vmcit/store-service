package com.app.storeservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.storeservice.dto.request.RoleRequest;
import com.app.storeservice.dto.response.RoleResponse;
import com.app.storeservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
