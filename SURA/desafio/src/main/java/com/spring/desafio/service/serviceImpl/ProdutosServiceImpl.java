package com.spring.desafio.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.desafio.models.Produtos;
import com.spring.desafio.repository.ProdutosRepository;
import com.spring.desafio.service.ProdutosService;

@Service
public class ProdutosServiceImpl implements ProdutosService {
	
	@Autowired
    ProdutosRepository produtosRepository;
	
	@Override
	public List<Produtos> listarProdutos() {
		return produtosRepository.findAll();
	}
	
	@Override
	public Produtos save(Produtos produtos) {
		return produtosRepository.save(produtos);
	}
	
	@Override
	public Produtos update(Produtos produtos) {	
		return produtosRepository.save(produtos);
	}

	@Override
	public void delete(Long id) {
		Optional<Produtos> produto = produtosRepository.findById(id);
		produtosRepository.delete(produto.get());
	}

}