package com.senac.banco.controller;

import java.util.Scanner;


import com.senac.banco.exception.SemSaldoException;
import com.senac.banco.modell.Cliente;
import com.senac.banco.view.Interface;

public class Console {
	Scanner r = new Scanner(System.in);
	Interface it = new Interface();
	private Cliente cliente;

	private Conta contaComum() {
		return new Conta(it.numeroConta(), it.numeroConfirmacao(),
				it.saldoUsuario());
	}

	private ContaEspecial contaEspecial() {
		return new ContaEspecial(it.numeroConta(), it.numeroConfirmacao(),
				it.saldoUsuario(), it.limite());
	}

	private ContaInvestimento contaInvestimento() {
		return new ContaInvestimento(it.numeroConta(), it.numeroConfirmacao(),
				it.saldoUsuario(), 0, 0.43);
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public Conta conta() {
		Conta conta = null;

		if (it.tipoConta().equalsIgnoreCase("comum")) {
			conta = contaComum();
		}

		if (it.tipoConta().equalsIgnoreCase("especial")) {
			conta = contaEspecial();
		}

		if (it.tipoConta().equalsIgnoreCase("investimento")) {
			conta = contaInvestimento();
		}
		return conta;
	}

	public void registraCliente() {
		cliente = new Cliente(it.nomeUsuario(), conta());
	}

	public void appmenu() {
		it.menu();
		int op = 0;
		System.out.println("");
		op = r.nextInt();
		switch (op) {
		case 1:{

			registraCliente();
		}
			break;
		case 2:

			try {
				cliente.getConta().saque(it.valorSaque());
			} catch (SemSaldoException e) {
				it.erro(" SEM SALDO ");
			}

			break;
		case 3:
			cliente.getConta().deposita(it.valorDeposito());

			break;
		case 4:
			it.extrato(cliente.getConta().getNumConta(), cliente.getConta()
					.getNumVerificacao(), cliente.getConta().getSaldo());

			break;
		}
	}
}