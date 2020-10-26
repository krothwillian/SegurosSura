package com.spring.desafio.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.desafio.models.Pedidos;

public interface PedidosService {
	
	List<Pedidos> listarPedidos();
	Pedidos save(@RequestBody @Validated Pedidos pedido);
	Pedidos update(@RequestBody @Validated Pedidos pedido);
	void delete(@RequestBody @Validated Long id);

}
