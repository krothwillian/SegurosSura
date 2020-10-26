package com.spring.desafio.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.desafio.models.Clientes;

public interface ClientesService {
		
	List<Clientes> listarClientes();
	Clientes consultaCliente(@PathVariable(value="nome") String nome);
	Clientes save(@RequestBody @Validated Clientes cliente);
	Clientes update(@RequestBody @Validated Clientes cliente);
	void delete(@RequestBody @Validated Long id);

}
