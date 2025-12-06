package com.example.E_TICARET.kullanici.controller;


import com.example.E_TICARET.kullanici.model.request.SignUpRequest;
import com.example.E_TICARET.kullanici.model.response.SignUpResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Kullanıcı API", description = "Kullanıcı işlemleri")
@RequestMapping("/kullanici")
@CrossOrigin("*")
public interface KullaniciApi {
    @Operation(
            summary = "Kullanıcı kayıt işlemi",
            description = "Yeni bir kullanıcı oluşturur"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Kullanıcı başarıyla oluşturuldu",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = SignUpResponse.class)
                    )
            ),
            @ApiResponse(responseCode = "400", description = "Geçersiz istek veya eksik veri"),
            @ApiResponse(responseCode = "409", description = "Kullanıcı zaten mevcut"),
            @ApiResponse(responseCode = "500", description = "Sunucu hatası")
    })
    @PostMapping("/signup")
    ResponseEntity<SignUpResponse> signup(@RequestBody SignUpRequest request);
}
