package com.how2code.designpattern.prototype.cache;

import java.util.HashMap;
import java.util.Map;

import com.how2code.designpattern.prototype.abstractentity.Person;
import com.how2code.designpattern.prototype.concreteentity.Student;
import com.how2code.designpattern.prototype.concreteentity.Worker;

public class PrototypeCache {
	
	private static Map<Long, Person> personPrototypeMap = new HashMap<Long, Person>();

	static {
		
		Person student = new Student(1L, "John", "Smith");
		Person worker = new Worker(2L, "Mario", "Rossi");
		
		personPrototypeMap.put(student.getId(), student);
		personPrototypeMap.put(worker.getId(), worker);
	}
	
	public static Person getPerson(Long personId) { 
		Person cachedPerson = personPrototypeMap.get(personId); 
		return (Person) cachedPerson.clone();
	}
}
