package com.senac.banco.modell;

import com.senac.banco.controller.Conta;

public class Cliente {
	private String nome;
	private Conta conta;

	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}