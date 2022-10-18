package com.servicoloja.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicoloja.projeto.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
