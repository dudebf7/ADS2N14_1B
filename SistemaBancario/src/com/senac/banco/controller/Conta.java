package com.senac.banco.controller;

import com.senac.banco.exception.SemSaldoException;

public class Conta {
	private int numConta;
	private int numVerificacao;
	private double saldo;

	public Conta(int numeroConta, int numeroConfirmacao, double saldoUsuario) {
		this.numConta = numeroConta;
		this.numVerificacao = numeroConfirmacao;
		this.saldo = saldoUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumVerificacao() {
		return numVerificacao;
	}

	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}

	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
	}

	public void saque(double valor) throws SemSaldoException {
		if (valor > getSaldo())
			throw new SemSaldoException();

		setSaldo(getSaldo() - valor);
	}

}