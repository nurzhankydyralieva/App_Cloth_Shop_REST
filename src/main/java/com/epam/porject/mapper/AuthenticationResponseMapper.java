//package com.epam.porject.mapper;
//
//import com.epam.porject.model.dto.AuthenticationResponseDto;
//import com.epam.porject.model.entitity.AuthenticationResponse;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//
//import java.util.List;
//
//@Mapper(componentModel = "spring")
//
//public interface AuthenticationResponseMapper {
//    AuthenticationResponseMapper INSTANCE = Mappers.getMapper(AuthenticationResponseMapper.class);
//
//    AuthenticationResponseDto toDto(AuthenticationResponse response);
//
//    AuthenticationResponse toEntity(AuthenticationResponseDto responseDto);
//
//    List<AuthenticationResponseDto> toDtos(List<AuthenticationResponse> responses);
//
//    List<AuthenticationResponse> toEntities(List<AuthenticationResponseDto> responseDtos);
//}
