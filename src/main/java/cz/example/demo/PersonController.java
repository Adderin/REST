package cz.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	Repository rep = new Repository();
	
	@RequestMapping("/person")
	public Person person(@RequestParam(value = "name", required=true) String name) {
		return rep.personByName(name);
	}

}
