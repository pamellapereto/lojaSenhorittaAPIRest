package com.servicoloja.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Itenspedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iditenspedido;
	
	@Column(nullable = false)
	private Long idpedido;
	
	@Column(nullable = false)
	private Long idproduto;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	
	
	
	public Itenspedido() {
		// TODO Auto-generated constructor stub
	}




	public Itenspedido(Long iditenspedido, Long idpedido, Long idproduto, Integer quantidade) {
		this.iditenspedido = iditenspedido;
		this.idpedido = idpedido;
		this.idproduto = idproduto;
		this.quantidade = quantidade;
	}




	public Long getIditenspedido() {
		return iditenspedido;
	}




	public void setIditenspedido(Long iditenspedido) {
		this.iditenspedido = iditenspedido;
	}




	public Long getIdpedido() {
		return idpedido;
	}




	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}




	public Long getIdproduto() {
		return idproduto;
	}




	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}




	public Integer getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}