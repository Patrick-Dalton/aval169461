package br.univel.patrick;

import javax.xml.crypto.Data;

public class Produto {
	
	private String NomeProduto;
	private long CodigoProduto;
	private Data datadeentrada;
	private double Valor;
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public Data getDatadeentrada() {
		return datadeentrada;
	}
	public void setDatadeentrada(Data datadeentrada) {
		this.datadeentrada = datadeentrada;
	}
	public long getCodigoProduto() {
		return CodigoProduto;
	}
	public void setCodigoProduto(long codigoProduto) {
		CodigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

}
