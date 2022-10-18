package com.servicoloja.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idproduto;
	
	@Column(length = 50, nullable = false)
	private String nomeproduto;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(length = 30, nullable = false)
	private String categoria;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(length = 255, nullable = false, unique = true)
	private String foto1;
	
	@Column(length = 255, nullable = false, unique = true)
	private String foto2;
	
	@Column(length = 255, nullable = false, unique = true)
	private String foto3;
	
	@Column(length = 255, nullable = false, unique = true)
	private String foto4;

	
	public Produto() {
		// TODO Auto-generated constructor stub
	}


	public Produto(Long idproduto, String nomeproduto, String descricao, String categoria, Integer quantidade,
			Double preco, String foto1, String foto2, String foto3, String foto4) {
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.preco = preco;
		this.foto1 = foto1;
		this.foto2 = foto2;
		this.foto3 = foto3;
		this.foto4 = foto4;
	}


	public Long getIdproduto() {
		return idproduto;
	}


	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}


	public String getNomeproduto() {
		return nomeproduto;
	}


	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getFoto1() {
		return foto1;
	}


	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}


	public String getFoto2() {
		return foto2;
	}


	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}


	public String getFoto3() {
		return foto3;
	}


	public void setFoto3(String foto3) {
		this.foto3 = foto3;
	}


	public String getFoto4() {
		return foto4;
	}


	public void setFoto4(String foto4) {
		this.foto4 = foto4;
	}
	
	

}
