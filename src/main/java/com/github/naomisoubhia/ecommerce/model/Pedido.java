package com.github.naomisoubhia.ecommerce.model;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter @Setter
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//varios pedidos podem estar vinculados a um cliente
	@ManyToOne(optional = false)
	private Cliente cliente;
	
	@Column(nullable = false)
	private Instant dataPedido;
	
	@Column(nullable = false)
	private Instant dataEntrega;
	
	@Column(nullable = false)
	private BigDecimal valTotalPedido;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length= 10)
	private Situacao  situacao;
	
	
}
