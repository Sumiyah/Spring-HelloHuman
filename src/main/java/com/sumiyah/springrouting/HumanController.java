package com.sumiyah.springrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/")
	public String human(@RequestParam(value ="name", required = false) String firstName, @RequestParam(value ="last_name", required = false) String lastName) {
		if (firstName == null && lastName == null) {
			// http://localhost:8080/
			return "<h1>Hello Human!</h1>"
					+ "<h3>Welcome to Spring Boot!</h3>";
		} else if (lastName == null){
			// http://localhost:8080/?name=Sumiyah
			return "<h1>Hello "+ firstName +"!</h1>"
					+ "<h3>Welcome to Spring Boot!</h3>";
		} else {
			// http://localhost:8080/?name=Sumiyah&last_name=Fallatah
			return "<h1>Hello "+ firstName +" "+ lastName +"!</h1>"
					+ "<h3>Welcome to Spring Boot!</h3>";
		}
	}

}
