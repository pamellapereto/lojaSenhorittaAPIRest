package com.servicoloja.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicoloja.projeto.model.Produto;
import com.servicoloja.projeto.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository pr;
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Produto produto) {
		pr.save(produto);
		return "Cadastro realizado";
	}
	
	@GetMapping("/listar")
	public List<Produto> lista(){
		return pr.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Produto> pesquisar(@PathVariable Long id){
		return pr.findById(id);
	}
	
	
}