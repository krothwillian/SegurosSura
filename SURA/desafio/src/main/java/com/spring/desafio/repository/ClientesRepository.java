package com.spring.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.desafio.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

	Clientes findByNome(String nome);

}
