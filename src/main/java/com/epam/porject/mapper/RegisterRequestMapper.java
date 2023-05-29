//package com.epam.porject.mapper;
//
//import com.epam.porject.model.dto.RegisterRequestDto;
//import com.epam.porject.model.entitity.RegisterRequest;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//
//import java.util.List;
//
//@Mapper(componentModel = "spring")
//
//public interface RegisterRequestMapper {
//    RegisterRequestMapper INSTANCE = Mappers.getMapper(RegisterRequestMapper.class);
//
//    RegisterRequestDto toDto(RegisterRequest request);
//
//    RegisterRequest toEntity(RegisterRequestDto requestDto);
//
//    List<RegisterRequestDto> toDtos(List<RegisterRequest> registerRequests);
//
//    List<RegisterRequest> toEntities(List<RegisterRequestDto> requestDtos);
//}
