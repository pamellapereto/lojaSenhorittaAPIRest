package com.servicoloja.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicoloja.projeto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
