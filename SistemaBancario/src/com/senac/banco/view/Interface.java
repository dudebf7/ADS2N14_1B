package com.senac.banco.view;

import java.util.Random;
import java.util.Scanner;

public class Interface {
	Scanner r = new Scanner(System.in);

	public void menu() {
		System.out.println("\n 1:**Novo Cliente**" + "\n 2: **Saque**"
				+ "\n 3: **Deposito**" + "\n 4: **Extrato** ");
	}

	public String nomeUsuario() {
		System.out.println("Digite seu nome:");
		return r.nextLine();
	}
	public int numeroConta() {
		Random gerador = new Random();

        int numero = gerador.nextInt(1001)+ 9999;
 
        System.out.println("Numero da Conta: "+numero);
		return numero;
	}

	public double saldoUsuario() {
		System.out.println("Digite seu saldo:");
		return r.nextDouble();
	}

	public int numeroConfirmacao() {
		Random gerador = new Random();

        int numero = gerador.nextInt(10)+ 10;
 
        System.out.println("Numero de Confirmação: "+numero);
		return numero;
	}

	public String tipoConta() {
		System.out.println("Digite tipo de conta:"
				+ "Comum, Especial ou Investimento");
		return r.nextLine();
	}
	public int valorDeposito() {
		System.out.println("Digite valor para depositar:");
		return r.nextInt();
	}
	public int valorSaque() {
		System.out.println("Digite valor para saque:");
		return r.nextInt();
	}



	public void extrato(int numConta, int numVerificacao, double saldo) {
		System.out.println("\n                 **Extrato**                 "
				+ "\nNumero da Conta: " + numConta + "\nSaldo: " + saldo
				+ "\n                 -------------                ");
	}

	public double limite() {
		System.out.println("Digite o limite da conta:");
		return r.nextDouble();
	}

	public void erro(String msg) {
		System.out.println(msg);
	}
}