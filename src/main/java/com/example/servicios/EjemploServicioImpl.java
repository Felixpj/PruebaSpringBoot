package com.example.servicios;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service("ejemploServicio")
public class EjemploServicioImpl implements EjemploServicio{

	private static final Log LOG=LogFactory.getLog(EjemploServicioImpl.class);
	
	@Override
	public List<Person> getPersonas() {
		List<Person> personas=new ArrayList<>();
		personas.add(new Person("Félix", 33));
		personas.add(new Person("Juan", 23));
		personas.add(new Person("Jorge", 43));
		personas.add(new Person("Arzuan", 13));
		LOG.info("HELLO FROM SERVICE");
		return personas;
	}
 

}
