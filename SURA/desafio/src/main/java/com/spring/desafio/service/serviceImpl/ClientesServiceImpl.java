package com.spring.desafio.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.desafio.models.Clientes;
import com.spring.desafio.repository.ClientesRepository;
import com.spring.desafio.service.ClientesService;


@Service
public class ClientesServiceImpl implements ClientesService{
	
	@Autowired
    ClientesRepository clienteRepository;
	
	@Override
	public List<Clientes> listarClientes() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Clientes consultaCliente(String nome) {
		return clienteRepository.findByNome(nome);
	}

	@Override
	public Clientes save(Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Override
	public Clientes update(Clientes cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(Long id) {
		Optional<Clientes> cliente = clienteRepository.findById(id);
		clienteRepository.delete(cliente.get());
	}

}
