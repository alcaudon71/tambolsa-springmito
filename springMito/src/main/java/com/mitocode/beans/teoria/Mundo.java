package com.mitocode.beans.teoria;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	@Value("Hola Mundo!")
	private String saludo;
	
	public String getSaludo() {
		return saludo;
	}
	
	// Inyeccion de dependencias
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
