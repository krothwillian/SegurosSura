package com.spring.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.desafio.models.Clientes;
import com.spring.desafio.models.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

	Clientes findById(long id);
}
