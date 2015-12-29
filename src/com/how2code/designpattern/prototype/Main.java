package com.how2code.designpattern.prototype;

import com.how2code.designpattern.prototype.abstractentity.Person;
import com.how2code.designpattern.prototype.cache.PrototypeCache;

public class Main {

	public static void main(String[] args) {
		Person person = PrototypeCache.getPerson(1L);
		person.appear();
		
		person = PrototypeCache.getPerson(2L);
		person.appear();
	}

}
