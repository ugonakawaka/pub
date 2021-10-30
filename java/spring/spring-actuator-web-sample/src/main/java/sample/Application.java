package sample;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.spring-application.application-availability.readiness
@RestController
@EnableAutoConfiguration
public class Application {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		// System.exit(SpringApplication.exit(SpringApplication.run(Application.class, args)));
	}
}
