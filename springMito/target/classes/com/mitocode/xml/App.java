package com.mitocode.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Spring con XML (Classic)
		// --------------------------------------------------
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		Persona per = appContext.getBean("persona", Persona.class);
		//Persona per = (Persona) appContext.getBean("persona");
		
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		
		
		System.out.println(per.getApodo());
		System.out.println(ciu.getNombre());
		
		
		((ConfigurableApplicationContext) appContext).close();
		
		
	}

}
