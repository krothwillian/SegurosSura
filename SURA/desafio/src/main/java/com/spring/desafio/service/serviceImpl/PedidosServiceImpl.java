package com.spring.desafio.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.desafio.models.Pedidos;
import com.spring.desafio.repository.PedidosRepository;
import com.spring.desafio.service.PedidosService;

@Service
public class PedidosServiceImpl implements PedidosService {
	
	@Autowired
    PedidosRepository pedidosRepository;
	
	@Override
	public List<Pedidos> listarPedidos() {
		return pedidosRepository.findAll();
	}
	
	@Override
	public Pedidos save(Pedidos pedido) {
		return pedidosRepository.save(pedido);
	}
	
	@Override
	public Pedidos update(Pedidos pedido) {	
		return pedidosRepository.save(pedido);
	}

	@Override
	public void delete(Long id) {
		Optional<Pedidos> pedido = pedidosRepository.findById(id);
		pedidosRepository.delete(pedido.get());
	}

}