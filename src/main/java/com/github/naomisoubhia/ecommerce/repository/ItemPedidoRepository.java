package com.github.naomisoubhia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.naomisoubhia.ecommerce.model.ItemPedido;

@Repository
public interface ItemPedidoRepository 
	extends JpaRepository<ItemPedido, Long> {

}
