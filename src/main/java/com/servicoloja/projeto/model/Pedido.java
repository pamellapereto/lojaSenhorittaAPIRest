package com.servicoloja.projeto.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idpedido;
	
	@Column(nullable = false)
	private Long idusuario;
	
	@Column(nullable = false)
	private Date datahora;
	
	@Column(length = 20, nullable = false)
	private String situacao;

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long idpedido, Long idusuario, Date datahora, String situacao) {
		this.idpedido = idpedido;
		this.idusuario = idusuario;
		this.datahora = datahora;
		this.situacao = situacao;
	}

	public Long getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	


}
