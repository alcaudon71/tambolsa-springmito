package com.mitocode.xml.teoria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.teoria.AppConfig;
import com.mitocode.beans.teoria.AppConfig2;
import com.mitocode.beans.teoria.Ciudad;
import com.mitocode.beans.teoria.Mundo;
import com.mitocode.beans.teoria.Persona;

public class App_old17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Spring con XML (Classic)
		// --------------------------------------------------
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		Persona per = appContext.getBean("persona", Persona.class);
		//Persona per = (Persona) appContext.getBean("persona");
		
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		
		
		System.out.println("Apodo: " + per.getApodo());
		System.out.println("Ciudad: " + ciu.getNombre());
		
		
		((ConfigurableApplicationContext) appContext).close();
		
		
	}

}
