package com.senac.banco.controller;

import com.senac.banco.exception.SemSaldoException;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numConta, int numVerificacao, double saldo,
			double limite) {
		super(numConta, numVerificacao, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void saque(double valor) throws SemSaldoException {
		if (valor > getLimite())
			throw new SemSaldoException();

		setSaldo(getSaldo() - valor);
	}
}