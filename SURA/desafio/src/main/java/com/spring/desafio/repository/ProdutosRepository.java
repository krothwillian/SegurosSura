package com.spring.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.desafio.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> { }
