package com.spring.desafio.utils;

import com.spring.desafio.models.Clientes;
import com.spring.desafio.repository.ClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataFake {

    @Autowired
    ClientesRepository cliRepository;

    //@PostConstruct
    public void savePosts(){

        List<Clientes> postList = new ArrayList<>();
        Clientes cli1 = new Clientes();
        cli1.setNome("Antonio");
        cli1.setEmail("Antonio@gmail.com");
        cli1.setSenha("12345678we");
        cli1.setRua("Aqui na frente");
        cli1.setCidade("Aparecida");
        cli1.setBairro("Do lado");
        cli1.setCep("89052-032");
        cli1.setEstado("Unidos");
        
        postList.add(cli1);
        
        cliRepository.save(cli1);
    }
}
