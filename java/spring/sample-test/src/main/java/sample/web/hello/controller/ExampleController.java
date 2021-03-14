package sample.web.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.exception.PatternRuntimeException;

@RestController
public class ExampleController {

	@RequestMapping("/hello")
    String hello() {
        return "Hello World!";
    }
	
	@RequestMapping("/xxx")
	String xxx() {
		
		PatternRuntimeException.throwXxxRuntimeException("x_x!");
		
        return "xxx";
    }
}
