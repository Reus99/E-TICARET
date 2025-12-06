package com.example.E_TICARET.kullanici.service;

import com.example.E_TICARET.kullanici.mapper.KullaniciMapper;
import com.example.E_TICARET.kullanici.model.entity.KullaniciEntity;
import com.example.E_TICARET.kullanici.model.request.SignUpRequest;
import com.example.E_TICARET.kullanici.model.response.SignUpResponse;
import com.example.E_TICARET.kullanici.repository.KullaniciJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KullaniciService {

    private final KullaniciMapper kullaniciMapper;
    private final KullaniciJpaRepository kullaniciJpaRepository;

    public SignUpResponse signUp(SignUpRequest signUpRequest) {
        KullaniciEntity entity = kullaniciMapper.toEntity(signUpRequest);
        kullaniciJpaRepository.save(entity);
        SignUpResponse response = kullaniciMapper.toResponse(entity);
        response.setMessage("Kayıt Başarılı...");
        return response;
    }
}
