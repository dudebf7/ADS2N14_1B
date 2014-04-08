
package com.senac.banco.app;

import com.senac.banco.controller.Console;


public class Aplicacao {

	public static void main(String[] args) {
		Console c = new Console();
		do {
			c.appmenu();
		} while (true);

	}

}