package com.example.E_TICARET.kullanici.model.request;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@NoArgsConstructor
public class SignUpRequest {

    @Schema(description = "Kullanıcı adı", example = "berkon123")
    public String username;

    @Schema(description = "Şifre", example = "P@ssw0rd")
    public String password;

    @Email
    @Schema(description = "E-posta adresi", example = "berkon@example.com")
    public String email;

    @Schema(description = "Telefon numarası", example = "+905551234567")
    public String phone;

    @Schema(description = "Ad", example = "Berkon")
    public String name;

    @Schema(description = "Soyad", example = "Cüneyt")
    public String surname;

    @Schema(description = "Adres", example = "İstanbul, Türkiye")
    public String address;
}
