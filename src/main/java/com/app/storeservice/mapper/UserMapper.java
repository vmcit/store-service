package com.app.storeservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.app.storeservice.dto.request.UserCreationRequest;
import com.app.storeservice.dto.request.UserUpdateRequest;
import com.app.storeservice.dto.response.UserResponse;
import com.app.storeservice.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
