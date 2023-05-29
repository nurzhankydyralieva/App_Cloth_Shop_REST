package com.epam.porject.mapper;

import com.epam.porject.model.dto.UserDto;
import com.epam.porject.model.entitity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

    List<UserDto> toDtos(List<User> users);

    List<User> toEntities(List<UserDto> userDtos);
}
