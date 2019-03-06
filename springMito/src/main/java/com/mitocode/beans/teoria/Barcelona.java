package com.mitocode.beans.teoria;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mitocode.interfaces.teoria.IEquipo;

//@Component
//@Repository		--> CAPA DAO
//@Controller		--> CAPA MVC
@Service
public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Barcelona FC";
	}

}
