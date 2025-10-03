package com.example.projeto10.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto10.model.UsuarioModel;

@Repository

public interface UsuarioRepository extends JpaRepository< UsuarioModel, UUID> {
    Optional<UsuarioModel> findByEmail(String email);



}