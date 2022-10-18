package com.servicoloja.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicoloja.projeto.model.Usuario;
import com.servicoloja.projeto.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	/*
	 * Para fazer as operações de crud no banco de dados,
	 * nós iremos usar as interfaces criadas no pacote 
	 * repository. Para isso será necessário fazer a 
	 * instância das interfaces. Utilizaremos um comando
	 * para realizar a instancia automática das interfaces
	 * o comando chama-se Autowired 
	 * */
	
	@Autowired
	private UsuarioRepository ur;
	
	@GetMapping
	public List<Usuario> lista(){
		return ur.findAll();
	}
}
