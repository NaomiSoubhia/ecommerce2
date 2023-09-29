package com.github.naomisoubhia.ecommerce.model;


import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Getter @Setter
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable= false, length= 100)
	private String nome;

	@Column(nullable= false)
	private Instant dataCadastro ;
	
	


	
	
	
}
