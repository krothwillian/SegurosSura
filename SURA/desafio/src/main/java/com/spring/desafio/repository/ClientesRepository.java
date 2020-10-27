package com.spring.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.desafio.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

	List<Clientes> findByNome(String nome);

}
