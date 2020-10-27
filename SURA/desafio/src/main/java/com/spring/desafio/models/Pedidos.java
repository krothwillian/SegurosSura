package com.spring.desafio.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_PEDIDOS")
public class Pedidos implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;

		@NotNull
		@Temporal(TemporalType.TIMESTAMP)
		private Date data;
				 
    	@OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "idCliente", nullable = false)
	    private Clientes clientes;
		
		@NotNull
		private String status;
		
		@NotNull		
		private String sessao;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Clientes getClientes() {
			return clientes;
		}

		public void setClientes(Clientes clientes) {
			this.clientes = clientes;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSessao() {
			return sessao;
		}

		public void setSessao(String sessao) {
			this.sessao = sessao;
		}
				
}