package com.spring.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.desafio.models.Clientes;
import com.spring.desafio.service.ClientesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
@CrossOrigin(origins = "*")
@Api(value = "Seguros SURA - API REST")
public class ClientesController {

	@Autowired
	ClientesService clienteService;

	@ApiOperation(value = "Consultar todos os clientes")
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public List<Clientes> listarClientes() {
		return clienteService.listarClientes();
	}
	
	@ApiOperation(value="Consultar um determinado cliente pelo nome")
	@RequestMapping(value = "/cliente/{nome}", method = RequestMethod.GET)
	public List<Clientes> consultarCliente(@PathVariable(value="nome") String nome){
		return clienteService.consultarCliente(nome);
	}

	@ApiOperation(value = "Salvar um cliente")
	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public Clientes save(@RequestBody @Validated Clientes cliente) {
		return clienteService.save(cliente);
	}
	
	@ApiOperation(value="Excluir um cliente pelo id")
	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value="id") Long id) {
		clienteService.delete(id);
	}

	@ApiOperation(value = "Atualizar um cliente")
	@RequestMapping(value = "/cliente", method = RequestMethod.PUT)
	public Clientes update(@RequestBody @Validated Clientes cliente) {
		return clienteService.save(cliente);
	}

}
