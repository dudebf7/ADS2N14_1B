package com.senac.mvc.model;
public class Telefone {
	private String numero;
	private String tipo;


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString() {
		return "Telefone [numero=" + numero + ", tipo=" + tipo + "]";
	}
}