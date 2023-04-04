package com.projeto.api;

import java.util.List;

public class ProjetoApiUsuario extends ProjetoApiEndereco {
	
	private int idUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private int senhaUsuario;
	private String cpfUsuario;
	private List<ProjetoApiEndereco> enderecos;
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNomeUsuario() {
		return nomeUsuario;
	}



	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}



	public String getEmailUsuario() {
		return emailUsuario;
	}



	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}



	public int getSenhaUsuario() {
		return senhaUsuario;
	}



	public void setSenhaUsuario(int senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}



	public String getCpfUsuario() {
		return cpfUsuario;
	}



	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}



	public List<ProjetoApiEndereco> getEnderecos() {
		return enderecos;
	}



	public void cadastraUsuario() {
		
	}
	
	public void removeUsuario() {
			
		}
	
	public void alteraUsuario() {
		
	}
	
	public void listarUsuario() {
		
	}
	
	public interface UsuarioInterface {
		
		public void getIdUsuario();
		public void getNomeUsuario();
		public void getSenhaUsuario();
		public void getCpfUsuario();
		public void getEmailUsuario();
		public void getEnderecos();
		
	   
	} 
	

}
