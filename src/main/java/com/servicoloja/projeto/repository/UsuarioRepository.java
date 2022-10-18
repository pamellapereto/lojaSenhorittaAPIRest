package com.servicoloja.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicoloja.projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
