package com.mitocode.beans.prac;

import org.springframework.stereotype.Component;

import com.mitocode.interfaces.prac.IEquipo;

@Component
public class Juventus_prac2 implements IEquipo {

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Juventus Turin";
	}

}
