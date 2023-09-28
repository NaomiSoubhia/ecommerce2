package com.github.naomisoubhia.ecommerce.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.naomisoubhia.ecommerce.controller.dto.ProdutoRequestCreate;
import com.github.naomisoubhia.ecommerce.controller.dto.ProdutoRequestUpdate;
import com.github.naomisoubhia.ecommerce.controller.dto.SearchedProduto;
import com.github.naomisoubhia.ecommerce.model.Produto;
import com.github.naomisoubhia.ecommerce.repository.ProdutoRepository;
import com.github.naomisoubhia.ecommerce.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public List<SearchedProduto> listAll() {
		List<SearchedProduto> result = 
				produtoService.list()
				.stream()
				.map(SearchedProduto::toDto)
				.collect(Collectors.toList());
		return result;
	}

	@PostMapping	
	public Produto create(@RequestBody ProdutoRequestCreate dto) {

		Produto produto = new Produto();
		

		produto.setPreco(dto.getPreco());
		produto.setNome(dto.getNome());		
		
		Produto result = produtoService.save(produto);
		
		return result;
	}

	@PutMapping
	public Produto update(@RequestBody ProdutoRequestUpdate dto) {
		
		boolean exists =
				produtoRepository.existsById(dto.getId());
		
		if (!exists) {
			throw new RuntimeException("Id não encontrado " 
							+ dto.getId());			
		}
		Produto produto = new Produto();
		// mapeamento
		produto.setId(dto.getId());
		produto.setPreco(dto.getPreco());
		produto.setNome(dto.getNome());		

		Produto result = produtoService.save(produto);
		return result;
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		produtoRepository.deleteById(id);		
	}



}

