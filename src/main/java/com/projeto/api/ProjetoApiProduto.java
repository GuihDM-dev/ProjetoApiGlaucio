package com.projeto.api;

import java.util.List;

public class ProjetoApiProduto extends ProjetoApiFornecedor {

	private int idProduto;
	private String nomeProduto;
	private float precoProduto;
	private int quantidadeEstoque;
	private List<ProjetoApiFornecedor> fornecedores;
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public List<ProjetoApiFornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<ProjetoApiFornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	public void cadastrarProduto() {
		
	}
	
	public void removerProduto(int idProduto) {
		
	}
	
	public void alterarProduto(int idProduto) {
		
	}
	
	public void listarProduto() {
		
	}
}
