package com.example.E_TICARET.kullanici.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kullanici")
public class KullaniciEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "kullanici_adi", nullable = false, unique = true)
    private String username;
    @Column(name = "sifre", nullable = false)
    private String password;
    @Email
    @Column(nullable = false)
    private String email;
    @Column(name = "telefon_no")
    private String phone;
    @Column(name = "adi", nullable = false)
    private String name;
    @Column(name = "soyadi", nullable = false)
    private String surname;
    @Column(name = "adres")
    private String address;

}
