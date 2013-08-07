package com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="p")
public class ProdutosBean {

	private int codProduto;
	private String descricao;
	private String foto;
	
	public String btnPesquisar(){
		
		if (getCod_produto() ==1) {
			setDescricao("Calça");
			setFoto("Calca.jpg");
		}else{
			setDescricao("Blusa");
			setFoto("Blusa.jpg");
		}
		return "";
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getCod_produto() {
		return codProduto;
	}

	public void setCod_produto(int cod_produto) {
		this.codProduto = cod_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

