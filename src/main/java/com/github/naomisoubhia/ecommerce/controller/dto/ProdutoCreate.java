package com.github.naomisoubhia.ecommerce.controller.dto;

import java.time.Instant;

public class ProdutoCreate {

	private long id;
	private String nome;
	private Instant dataCadastro ;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	

}
