package com.senac.mvc.model;

public class Pessoa {
	private String nome;
	private String endereco;
	private Telefone t = new Telefone();

	public String getNome() {
		return nome;
	}
	public Telefone getT() {
		return t;
	}
	public void setT(Telefone t) {
		this.t = t;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String toString() {
		return "Contato:\n nome: " + nome + "\n endereco: " + endereco + "\n tipo: "+t.getTipo()+"\n numero: " + t.getNumero()+""
				+ "\n";
	}


}