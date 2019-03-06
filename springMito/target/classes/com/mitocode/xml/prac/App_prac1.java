package com.mitocode.xml.prac;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.prac.Barcelona;
import com.mitocode.beans.prac.Jugador;
import com.mitocode.beans.prac.Juventus;

public class App_prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Barcelona   2-Juventus");
		int respuesta = sc.nextInt();
		
		// Spring con XML (Classic)
		// --------------------------------------------------
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/prac/beans.xml");
		
		Jugador jug = appContext.getBean("jugador1", Jugador.class);
				
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;
		default:
			break;
		}
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar() + " - " + jug.getCamiseta().getNumero() 
				+ " - " + jug.getCamiseta().getMarca().getNombre() );
		
		((ConfigurableApplicationContext) appContext).close();
		
		
	}
	
}
