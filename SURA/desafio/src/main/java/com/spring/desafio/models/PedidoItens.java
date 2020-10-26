package com.spring.desafio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_PEDIDO_ITENS")
public class PedidoItens implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		@NotNull
		private String produto;
		
		@NotNull
		private Integer quantidade;
		
		@NotNull
		private Long valor;
		
		@NotNull
		private Long subTotal;
		
		@OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "idPedido", nullable = false)
	    private Pedidos pedidos;
		
		@OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "idProduto", nullable = false)
	    private Produtos produtos;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Long getValor() {
			return valor;
		}

		public void setValor(Long valor) {
			this.valor = valor;
		}

		public Long getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(Long subTotal) {
			this.subTotal = subTotal;
		}

		public Pedidos getPedidos() {
			return pedidos;
		}

		public void setPedidos(Pedidos pedidos) {
			this.pedidos = pedidos;
		}

		public Produtos getProdutos() {
			return produtos;
		}

		public void setProdutos(Produtos produtos) {
			this.produtos = produtos;
		}
						
}		