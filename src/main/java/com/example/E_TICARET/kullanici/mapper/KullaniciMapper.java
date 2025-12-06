package com.example.E_TICARET.kullanici.mapper;

import com.example.E_TICARET.kullanici.model.entity.KullaniciEntity;
import com.example.E_TICARET.kullanici.model.request.SignUpRequest;
import com.example.E_TICARET.kullanici.model.response.SignUpResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface KullaniciMapper {

    KullaniciMapper INSTANCE = Mappers.getMapper(KullaniciMapper.class);

    @Mapping(target = "id", ignore = true)
    KullaniciEntity toEntity(SignUpRequest request);

    SignUpResponse toResponse(KullaniciEntity kullanici);
}
