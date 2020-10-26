package com.spring.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.desafio.models.PedidoItens;

public interface PedidoItensRepository extends JpaRepository<PedidoItens, Long> { }