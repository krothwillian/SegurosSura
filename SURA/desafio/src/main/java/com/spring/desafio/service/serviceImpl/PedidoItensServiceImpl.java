package com.spring.desafio.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.desafio.models.PedidoItens;
import com.spring.desafio.repository.PedidoItensRepository;
import com.spring.desafio.service.PedidoItensService;


@Service
public class PedidoItensServiceImpl implements PedidoItensService {
	
	@Autowired
    PedidoItensRepository pedidoItensRepository;
	
	@Override
	public List<PedidoItens> listarPedidoItens() {
		return pedidoItensRepository.findAll();
	}
	
	@Override
	public PedidoItens save(PedidoItens pedidoItens) {
		return pedidoItensRepository.save(pedidoItens);
	}
	
	@Override
	public PedidoItens update(PedidoItens pedidoItens) {	
		return pedidoItensRepository.save(pedidoItens);
	}

	@Override
	public void delete(Long id) {
		Optional<PedidoItens> pedidoItem = pedidoItensRepository.findById(id);
		pedidoItensRepository.delete(pedidoItem.get());
	}

}