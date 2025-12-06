package com.example.E_TICARET.kullanici.controller;

import com.example.E_TICARET.kullanici.model.request.SignUpRequest;
import com.example.E_TICARET.kullanici.model.response.SignUpResponse;
import com.example.E_TICARET.kullanici.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KullaniciController implements KullaniciApi{
    private final KullaniciService kullaniciService;
    @Override
    public ResponseEntity<SignUpResponse> signup( SignUpRequest request) {
        SignUpResponse response = kullaniciService.signUp(request);
        return ResponseEntity.ok(response);
    }

}
