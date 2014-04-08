package com.senac.banco.controller;

public class ContaInvestimento extends Conta {
	private int data;
	private double taxa;

	public ContaInvestimento(int numeroConta, int numeroVerificacao,
			double saldoTotal, int data, double taxa) {
		super(numeroConta, numeroVerificacao, saldoTotal);
		this.data = data;
		this.taxa = taxa;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void dividendo() {
		double taxa = 0.43;
		setSaldo(((getSaldo() / 100) * taxa) + getSaldo());
	}

}