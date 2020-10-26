package com.spring.desafio.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.desafio.models.Produtos;

public interface ProdutosService {
	
	List<Produtos> listarProdutos();
	Produtos save(@RequestBody @Validated Produtos produtos);
	Produtos update(@RequestBody @Validated Produtos produtos);
	void delete(@RequestBody @Validated Long id);

}
