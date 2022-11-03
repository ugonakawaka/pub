package app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.test.Iam;
import app.test2.Iam2;

@RestController
@RequestMapping("/users")
public class MyRestController {

	private Iam iam;
	private Iam2 iam2;
	
	public MyRestController(Iam iam, Iam2 iam2 ) {
		this.iam = iam;
		this.iam2 = iam2;
	}

	@GetMapping("/{userId}")
	public String getUser(@PathVariable Long userId) {

		if (userId == 9999) {
			return iam.ng();
		}
		return " i am " + iam.name();
	}
	
	@GetMapping("/test2/{userId}")
	public String user2(@PathVariable Long userId) {

		if (userId == 9999) {
			return iam2.ng();
		}
		return " i am " + iam2.name();
	}


}