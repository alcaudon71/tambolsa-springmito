package com.mitocode.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Barcelona;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Juventus;
import com.mitocode.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Spring con XML (Classic)
		// --------------------------------------------------
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		Jugador jug = appContext.getBean("messi", Jugador.class);
		
		Barcelona bar = appContext.getBean("barcelona", Barcelona.class);
		Juventus juv = appContext.getBean("juventus", Juventus.class);
		
		IEquipo inter = appContext.getBean("barcelona", IEquipo.class);
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
		//System.out.println(bar.mostrar());
		//System.out.println(juv.mostrar());

		System.out.println(inter.mostrar());
		
		
		((ConfigurableApplicationContext) appContext).close();
		
		
	}

}
