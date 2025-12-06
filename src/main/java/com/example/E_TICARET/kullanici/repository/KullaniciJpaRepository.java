package com.example.E_TICARET.kullanici.repository;

import com.example.E_TICARET.kullanici.model.entity.KullaniciEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciJpaRepository extends JpaRepository<KullaniciEntity,Long> {
}
