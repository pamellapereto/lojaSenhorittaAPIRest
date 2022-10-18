package com.servicoloja.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idusuario;
	
	@Column(length = 30, nullable = false, unique = true)
	private String nomeusuario;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(length = 50, nullable = false)
	private String nomecompleto;
	
	@Column(length = 15, nullable = false, unique = true)
	private String cpf;
	
	@Column(length = 255, nullable = false)
	private String foto;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long idusuario, String nomeusuario, String senha, String email, String nomecompleto, String cpf,
			String foto) {
		this.idusuario = idusuario;
		this.nomeusuario = nomeusuario;
		this.senha = senha;
		this.email = email;
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.foto = foto;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomecompleto() {
		return nomecompleto;
	}

	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
