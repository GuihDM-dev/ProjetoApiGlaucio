package com.projeto.api;

import java.util.Date;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.api.ProjetoApiCarrinhoDeCompra.CarrinhoDeCompraInterface;
import com.projeto.api.ProjetoApiUsuario.UsuarioInterface;

@SpringBootApplication

public class ProjetoApiPedidos extends ProjetoApiFormaDePagamento implements UsuarioInterface,CarrinhoDeCompraInterface {
	

	
		private	int idPedido;
		private	UsuarioInterface usuario;
		private	String endereco;
		private	ProjetoApiFormaDePagamento formaDePagamento;
		private	CarrinhoDeCompraInterface carrinhoDeCompras;
		private	Date dataEntrada;
		private	Date dataEmissao;
		private	double desconto;
		private double valorTotal;
		
		public int getIdPedido() {
			return idPedido;
		}
		public UsuarioInterface getUsuario() {
			return usuario;
		}
		public void setUsuario(UsuarioInterface usuario) {
			this.usuario = usuario;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public ProjetoApiFormaDePagamento getFormaDePagamento() {
			return formaDePagamento;
		}
		public void setFormaDePagamento(ProjetoApiFormaDePagamento formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}
		public CarrinhoDeCompraInterface getCarrinhoDeCompras() {
			return carrinhoDeCompras;
		}
		public void setCarrinhoDeCompras(CarrinhoDeCompraInterface carrinhoDeCompras) {
			this.carrinhoDeCompras = carrinhoDeCompras;
		}
		public Date getDataEntrada() {
			return dataEntrada;
		}
		public void setDataEntrada(Date dataEntrada) {
			this.dataEntrada = dataEntrada;
		}
		public Date getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(Date dataEmissao) {
			this.dataEmissao = dataEmissao;
		}
		public double getDesconto() {
			return desconto;
		}
		public void setDesconto(double desconto) {
			this.desconto = desconto;
		}
		public double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}
		public void setIdPedido(int idPedido) {
			this.idPedido = idPedido;
		}
		
		public ProjetoApiPedidos() {
			
		}
		
		public void concluirPedido( int idPedido, int idUsuario, int idCarrinhoDeCompras, String idEndereco, int getIdPagamento) {
		
		}
		
		public void cancelarPedido(int idPedido) {
			
		}
		
		public void rastreioPedido(int idPedido) {
			
		}
		
		public void aplicarDesconto(double desconto) {
			
		}
		
		public void calcularFrete() {
			
		}

		public void formaEnvio() {
	
		}

		public void statusPedido() {
	
		}
		
		public void getIdUsuario() {
			// TODO Auto-generated method stub
			
		}
		
		public void getNomeUsuario() {
			// TODO Auto-generated method stub
			
		}
		
		public void getSenhaUsuario() {
			// TODO Auto-generated method stub
			
		}
		
		public void getCpfUsuario() {
			// TODO Auto-generated method stub
			
		}
	
		public void getEmailUsuario() {
			// TODO Auto-generated method stub
			
		}
		
		public void getEnderecos() {
			// TODO Auto-generated method stub
			
		}
		
		public void getIdCarrinhoDeCompra() {
			// TODO Auto-generated method stub
			
		}
		
		public void getItemProdutos() {
			// TODO Auto-generated method stub
			
		}
		
		public void getDataEmissaoCarrinho() {
			// TODO Auto-generated method stub
			
		}
		
		public void getDataEntradaCarrinho() {
			// TODO Auto-generated method stub
			
		}
		
		public void getValorTotalCarrinho() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
