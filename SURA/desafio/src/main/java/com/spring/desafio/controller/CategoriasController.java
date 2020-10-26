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

import com.spring.desafio.models.Categorias;
import com.spring.desafio.models.Categorias;
import com.spring.desafio.service.CategoriasService;
import com.spring.desafio.service.CategoriasService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/categorias")
@CrossOrigin(origins = "*")
@Api(value = "Seguros SURA - API REST")
public class CategoriasController {

	@Autowired
	CategoriasService categoriasService;

	@ApiOperation(value = "Consultar todos os categoriass")
	@RequestMapping(value = "/categorias", method = RequestMethod.GET)
	public List<Categorias> listarCategorias() {
		return categoriasService.listarCategorias();
	}
	
	@ApiOperation(value = "Salvar uma categorias")
	@RequestMapping(value = "/categoria", method = RequestMethod.POST)
	public Categorias save(@RequestBody @Validated Categorias categorias) {
		return categoriasService.save(categorias);
	}
	
	@ApiOperation(value="Excluir uma categorias pelo id")
	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value="id") Long id) {
		categoriasService.delete(id);
	}

	@ApiOperation(value = "Atualizar uma categoria")
	@RequestMapping(value = "/categoria", method = RequestMethod.PUT)
	public Categorias update(@RequestBody @Validated Categorias categorias) {
		return categoriasService.save(categorias);
	}

}