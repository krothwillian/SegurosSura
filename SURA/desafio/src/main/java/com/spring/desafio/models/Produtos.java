package com.spring.desafio.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name="TB_PRODUTOS")
public class Produtos implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		@NotNull
		private String produto;
		
		@NotNull
		private Long preco;
		
		@NotNull
		private Integer quantidade;
		
		@NotNull
		private String descricao;
		
		@NotNull
		private String foto;
		
		@OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "idCategorias", nullable = false)
	    private Categorias categorias;

		@OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "produtos")
	    private PedidoItens pedidoItens;

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

		public Long getPreco() {
			return preco;
		}

		public void setPreco(Long preco) {
			this.preco = preco;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public Categorias getCategorias() {
			return categorias;
		}

		public void setCategorias(Categorias categorias) {
			this.categorias = categorias;
		}

		public PedidoItens getPedidoItens() {
			return pedidoItens;
		}

		public void setPedidoItens(PedidoItens pedidoItens) {
			this.pedidoItens = pedidoItens;
		}
		
}