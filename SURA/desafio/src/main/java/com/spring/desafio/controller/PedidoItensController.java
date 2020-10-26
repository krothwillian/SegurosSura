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

import com.spring.desafio.models.PedidoItens;
import com.spring.desafio.service.PedidoItensService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/pedidoItens")
@CrossOrigin(origins = "*")
@Api(value = "Seguros SURA - API REST")
public class PedidoItensController {

	@Autowired
	PedidoItensService pedidoItensService;

	@ApiOperation(value = "Consultar todos os itens")
	@RequestMapping(value = "/pedidoItens", method = RequestMethod.GET)
	public List<PedidoItens> listarPedidoItens() {
		return pedidoItensService.listarPedidoItens();
	}
	
	@ApiOperation(value = "Salvar um item")
	@RequestMapping(value = "/pedidoItens", method = RequestMethod.POST)
	public PedidoItens save(@RequestBody @Validated PedidoItens pedidoItens) {
		return pedidoItensService.save(pedidoItens);
	}
	
	@ApiOperation(value="Excluir um item pelo id")
	@RequestMapping(value = "/pedidoItens/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value="id") Long id) {
		pedidoItensService.delete(id);
	}

	@ApiOperation(value = "Atualizar um item")
	@RequestMapping(value = "/pedidoItens", method = RequestMethod.PUT)
	public PedidoItens update(@RequestBody @Validated PedidoItens pedidoItens) {
		return pedidoItensService.save(pedidoItens);
	}

}