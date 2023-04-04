package com.projeto.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ProjetoApiFormaDePagamento {

	private int idPagamento;
		
	public enum TipoPagamento {
		D, CD, CC, P
	}
	
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	public void getEnderecos() {
		// TODO Auto-generated method stub
		
	}
	
}
