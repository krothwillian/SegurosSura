package com.spring.desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.desafio.controller.CategoriasController;
import com.spring.desafio.controller.ClientesController;
import com.spring.desafio.controller.PedidoItensController;
import com.spring.desafio.controller.PedidosController;
import com.spring.desafio.controller.ProdutosController;
import com.spring.desafio.models.Categorias;
import com.spring.desafio.models.Clientes;
import com.spring.desafio.models.PedidoItens;
import com.spring.desafio.models.Pedidos;
import com.spring.desafio.models.Produtos;

@SpringBootTest
class DesafioApplicationTests {

	@Autowired
	ClientesController clientesController;
	
	@Autowired
	CategoriasController categoriasController;
	
	@Autowired
	ProdutosController produtosController;
	
	@Autowired
	PedidoItensController pedidoItensController;
	
	@Autowired
	PedidosController pedidosController;
		
	@Test
	void consultarCliente() {
		String nomeClienteBuscar = "Antonio";
		List<Clientes> retorno = this.clientesController.consultarCliente(nomeClienteBuscar);
		assertEquals(nomeClienteBuscar, retorno.get(0).getNome());
	}

	@Test
	void inserirCategoria() {
		Categorias categoria = new Categorias();
		categoria.setNome("Condominio");
		categoriasController.save(categoria);
	}
	
	@Test
	void consultarProdutos() {		
		List<Produtos> retorno = this.produtosController.listarProdutos();
		assertEquals(1, retorno.size());		
	}	
	
	@Test
	void excluirPedido() {		
		this.pedidosController.delete(48l);		
	}		

	@Test
	void consultarPedidoItens() {		
		List<PedidoItens> retorno = this.pedidoItensController.listarPedidoItens();
		assertEquals(1, retorno.size());		
	}	
	
}
