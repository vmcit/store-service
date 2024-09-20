package com.app.storeservice.mapper;

import org.mapstruct.Mapper;

import com.app.storeservice.dto.request.PermissionRequest;
import com.app.storeservice.dto.response.PermissionResponse;
import com.app.storeservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
