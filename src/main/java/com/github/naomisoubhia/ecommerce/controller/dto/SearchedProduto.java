package com.github.naomisoubhia.ecommerce.controller.dto;

import com.github.naomisoubhia.ecommerce.model.Produto;

public class SearchedProduto {
	private Long id;
	private String nome;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static SearchedProduto toDto(Produto produto) {
		SearchedProduto dto = new SearchedProduto();
		dto.setId(produto.getId());
		dto.setNome(produto.getNome());		
		return dto;
	}


}
