package com.spring.desafio.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.desafio.models.Categorias;
import com.spring.desafio.repository.CategoriasRepository;
import com.spring.desafio.service.CategoriasService;


@Service
public class CategoriasServiceImpl implements CategoriasService {
	
	@Autowired
    CategoriasRepository categoriasRepository;
	
	@Override
	public List<Categorias> listarCategorias() {
		return categoriasRepository.findAll();
	}
	
	@Override
	public Categorias save(Categorias categorias) {
		return categoriasRepository.save(categorias);
	}
	
	@Override
	public Categorias update(Categorias categorias) {	
		return categoriasRepository.save(categorias);
	}

	@Override
	public void delete(Long id) {
		Optional<Categorias> categoria = categoriasRepository.findById(id);
		categoriasRepository.delete(categoria.get());
	}

}