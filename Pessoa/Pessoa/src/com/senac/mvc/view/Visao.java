package com.senac.mvc.view;

import com.senac.mvc.controller.Controlador;

public class Visao{

	public static void main(String[] args) {
		Controlador controlador=new Controlador();
		controlador.obtemAgenda();
		controlador.toString();
		System.out.println(controlador);

	}
}