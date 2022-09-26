package br.com.silvahd.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.silvahd.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong couter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
	}
	
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(couter.incrementAndGet());
	    person.setFistName("Diego");
	    person.setLastName("Henrique");
	    person.setAddress("Uberlândia - Minas Gerais - Brasil");
	    person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(couter.incrementAndGet());
	    person.setFistName("Person name" + i);
	    person.setLastName("Last name" + i);
	    person.setAddress("Some address - Brasil" + i);
	    person.setGender("Male");
		return person;
	}
	

}
