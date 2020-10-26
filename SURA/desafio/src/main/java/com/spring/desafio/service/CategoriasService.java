package com.spring.desafio.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.desafio.models.Categorias;

public interface CategoriasService {
	
	List<Categorias> listarCategorias();
	Categorias save(@RequestBody @Validated Categorias categorias);
	Categorias update(@RequestBody @Validated Categorias categorias);
	void delete(@RequestBody @Validated Long id);

}
