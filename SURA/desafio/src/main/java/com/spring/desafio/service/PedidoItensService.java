package com.spring.desafio.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.desafio.models.PedidoItens;

public interface PedidoItensService {
	
	List<PedidoItens> listarPedidoItens();
	PedidoItens save(@RequestBody @Validated PedidoItens pedidoItens);
	PedidoItens update(@RequestBody @Validated PedidoItens pedidoItens);
	void delete(@RequestBody @Validated Long id);

}