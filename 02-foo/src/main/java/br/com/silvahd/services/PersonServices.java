package br.com.silvahd.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.silvahd.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong couter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(couter.incrementAndGet());
	    person.setFistName("Diego");
	    person.setLastName("Henrique");
	    person.setAddress("Uberlândia - Minas Gerais - Brasil");
	    person.setGender("Male");
		return person;
	}
	

}
