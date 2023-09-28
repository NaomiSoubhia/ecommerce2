package com.github.naomisoubhia.ecommerce.controller.dto;

public class ProdutoRequestCreate {
	private String nome;
	private int preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
