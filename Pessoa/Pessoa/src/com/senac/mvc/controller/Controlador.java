package com.senac.mvc.controller;
import com.senac.mvc.model.Agenda;

	public class Controlador {
		Agenda agenda;

		public Controlador(){
			agenda=new Agenda();
		}

		public Agenda obtemAgenda(){
			return this.agenda;
		}

		public String toString(){
			return agenda.toString();
		}


}