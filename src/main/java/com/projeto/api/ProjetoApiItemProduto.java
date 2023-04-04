package com.projeto.api;

public class ProjetoApiItemProduto extends ProjetoApiProduto {
		private int idItensProduto;
		private ProjetoApiFornecedor produto;
		private int quantidade;
		public int getIdItensProduto() {
			return idItensProduto;
		}
		public void setIdItensProduto(int idItensProduto) {
			this.idItensProduto = idItensProduto;
		}
		public ProjetoApiFornecedor getProduto() {
			return produto;
		}
		public void setProduto(ProjetoApiProduto produto) {
			this.produto = produto;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		
		public void cadastrarItemProduto(ProjetoApiProduto produto, int quantidade) {
			
		}
		
		public void valorTotalItem() {
			
		}
}
