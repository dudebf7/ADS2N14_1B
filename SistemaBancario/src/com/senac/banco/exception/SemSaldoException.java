package com.senac.banco.exception;

public class SemSaldoException extends Exception {

	private static final long serialVersionUID = -2219588382696104783L;

	public SemSaldoException() {
		super("Limite ultrapaçado");
	}

}