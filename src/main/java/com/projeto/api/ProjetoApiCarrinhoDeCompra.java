package com.projeto.api;

import java.util.Date;
import java.util.List;

public class ProjetoApiCarrinhoDeCompra extends ProjetoApiItemProduto {
	
	private int idCarrinhoDeCompra;
	private double valorTotalCarrinho;
	private Date dataEmissaoCarrinho;
	private Date dataEntradaCarrinho;
	private List<ProjetoApiItemProduto> itemProdutos;
	public int getIdCarrinhoDeCompra() {
		return idCarrinhoDeCompra;
	}
	public void setIdCarrinhoDeCompra(int idCarrinhoDeCompra) {
		this.idCarrinhoDeCompra = idCarrinhoDeCompra;
	}
	public double getValorTotal() {
		return valorTotalCarrinho;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotalCarrinho = valorTotal;
	}
	public Date getDataEmissaoCarrinho() {
		return dataEmissaoCarrinho;
	}
	public void setDataEmissaoCarrinho(Date dataEmissaoCarrinho) {
		this.dataEmissaoCarrinho = dataEmissaoCarrinho;
	}
	public Date getDataEntrada() {
		return dataEntradaCarrinho;
	}
	public void setDataEntrada(Date dataEntradaCarrinho) {
		this.dataEntradaCarrinho = dataEntradaCarrinho;
	}
	public List<ProjetoApiItemProduto> getItemProdutos() {
		return itemProdutos;
	}
	public void setItemProdutos(List<ProjetoApiItemProduto> itemProdutos) {
		this.itemProdutos = itemProdutos;
	}
	
	public void cadastrarCarrinho(ProjetoApiItemProduto produto) {
		
	}
	
	public void listarCarrinho() {
			
	}
	
	public void removerItemProduto() {
		
	}
	
	public void adicionarItemProduto() {
		
	}
	
	public void valorTotal() {
		
	}
	
	public interface CarrinhoDeCompraInterface {
			
			public void getIdCarrinhoDeCompra();
			public void getValorTotalCarrinho();
			public void getDataEmissaoCarrinho();
			public void getDataEntradaCarrinho();
			public void getItemProdutos();
			   
		} 
	

}
