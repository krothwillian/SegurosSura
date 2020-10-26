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

import com.spring.desafio.models.Pedidos;
import com.spring.desafio.service.PedidosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/pedidos")
@CrossOrigin(origins = "*")
@Api(value = "Seguros SURA - API REST")
public class PedidosController {

	@Autowired
	PedidosService pedidoService;

	@ApiOperation(value = "Consultar todos os pedidos")
	@RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	public List<Pedidos> listarPedidos() {
		return pedidoService.listarPedidos();
	}
	
	@ApiOperation(value = "Salvar um pedido")
	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	public Pedidos save(@RequestBody @Validated Pedidos pedido) {
		return pedidoService.save(pedido);
	}
	
	@ApiOperation(value="Excluir um pedido pelo id")
	@RequestMapping(value = "/pedido/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value="id") Long id) {
		pedidoService.delete(id);
	}

	@ApiOperation(value = "Atualizar um pedido")
	@RequestMapping(value = "/pedido", method = RequestMethod.PUT)
	public Pedidos update(@RequestBody @Validated Pedidos pedido) {
		return pedidoService.save(pedido);
	}

}
