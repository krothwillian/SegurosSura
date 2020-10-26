package com.spring.desafio.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_CLIENTES")
public class Clientes implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		@NotNull
		private String nome;
		
		@NotNull
		private String email;
		
		@NotNull
		private String senha;
		
		@NotNull
		private String rua;
		
		@NotNull
		private String cidade;
		
		@NotNull
		private String bairro;
		
		@NotNull
		private String cep;
		
		@NotNull
		private String estado;
		
		@OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "clientes")
	    private Pedidos pedido;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public Pedidos getPedido() {
			return pedido;
		}

		public void setPedido(Pedidos pedido) {
			this.pedido = pedido;
		}

}
