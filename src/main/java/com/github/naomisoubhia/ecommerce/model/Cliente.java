package com.github.naomisoubhia.ecommerce.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter @Setter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(length = 9)
	private  String cep;
	
	@Column(length = 100)
	private String logradouro;
	
	@Column(length = 10)
	private String numero;
	
	@Column(length = 20)
	private String complemento;
	
	@Column(length = 60)
	private String bairro;
	
	@Column(length = 60)
	private String municipio;
	
	@Column(length = 2)
	private String uf;
	
	private Instant dataCadastro;
	
	private boolean ativo;


}
