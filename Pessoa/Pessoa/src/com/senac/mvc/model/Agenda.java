package com.senac.mvc.model;
import java.util.Random;
import java.util.Scanner;

public class Agenda{

	Pessoa[] pessoa = new Pessoa[5];

	public String sorteiaNome(){
		Random r = new Random();
		String nome[] ={"Pelé","Cafu","Ronaldo","Roberto","Jonas"};
		return nome[r.nextInt(5)];
	}

	public String sorteiaEndereco(){
		Random r = new Random();
		String endereco[] ={"847","120","544","871","456"};
		return endereco[r.nextInt(5)];
	}

	public Agenda(){
		String nome;
		String endereco;
		Scanner entrada = new Scanner(System.in);


		for(int i=0; i < 5;i++){
			Telefone t=new Telefone();
			pessoa[i]=new Pessoa();
			nome = sorteiaNome();
			endereco = sorteiaEndereco();
			pessoa[i].setNome(nome);
			pessoa[i].setEndereco(endereco);
			System.out.println("Digite o telefone: xxx-xxxx");
			t.setNumero(entrada.next());
			System.out.println("Digite o tipo: 1:Celular 2:Casa 3:Trabalho");
			t.setTipo(entrada.next());
			pessoa[i].setT(t);
		}
	}

	public String toString() {
		String saida="Agenda\n";
		for(int i=0; i < 5;i++){
			saida=saida+pessoa[i].toString()+"\n";
		}
		return saida;

	}

}