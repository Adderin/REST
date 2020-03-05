package cz.example.demo;

import java.util.Hashtable;
import java.util.Map;

public class Repository {
	
	static Map<String, Person> persons = new Hashtable<>();
	
	static {
		persons.put("Andrew", new Person("Andrew", 31));
		persons.put("John", new Person("John", 35));
		persons.put("Petr", new Person("Petr", 38));
		persons.put("Bob", new Person("Bob", 40));
	}
	
	
	public Person personByName(String name) {
		return persons.get(name);
	}
	
	public Person addPerson(Person p) {
		persons.put(p.getName(),p);
		return p;
	}
}
