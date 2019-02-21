package com.mitocode.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App_old5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java sin Spring 
		// --------------------------------------------------
		//Mundo m = new Mundo();
		//m.getSaludo();
		
		// Spring con XML (Classic)
		// --------------------------------------------------
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		// Spring con Anotaciones (New) 
		// --------------------------------------------------
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		
		// Spring con Anotaciones registradas (New) 
		// --------------------------------------------------
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		//Mundo m = (Mundo) appContext.getBean("mundo");
		Mundo m = appContext.getBean("marte", Mundo.class);
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext) appContext).close();
		
		
	}

}
