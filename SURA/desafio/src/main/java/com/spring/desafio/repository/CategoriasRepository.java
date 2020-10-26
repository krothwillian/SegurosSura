package com.spring.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.desafio.models.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> { }