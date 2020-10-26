package com.spring.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.desafio.models.Produtos;
import com.spring.desafio.service.ProdutosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/produtos")
@CrossOrigin(origins = "*")
@Api(value = "Seguros SURA - API REST")
public class ProdutosController {

	@Autowired
	ProdutosService produtoService;

	@ApiOperation(value = "Consultar todos os produtos")
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public List<Produtos> listarProdutos() {
		return produtoService.listarProdutos();
	}
	
	@ApiOperation(value = "Salvar um produto")
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public Produtos save(@RequestBody @Validated Produtos produto) {
		return produtoService.save(produto);
	}
	
	@ApiOperation(value="Excluir um produto pelo id")
	@RequestMapping(value = "/produto/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value="id") Long id) {
		produtoService.delete(id);
	}

	@ApiOperation(value = "Atualizar um produto")
	@RequestMapping(value = "/produto", method = RequestMethod.PUT)
	public Produtos update(@RequestBody @Validated Produtos produto) {
		return produtoService.save(produto);
	}

}
