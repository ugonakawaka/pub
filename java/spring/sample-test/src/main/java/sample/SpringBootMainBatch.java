package sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMainBatch implements CommandLineRunner {

	public static void main(String[] args) {

		System.exit(SpringApplication.exit(new SpringApplication(SpringBootMainBatch.class).run()));

	}

	@Override
	public void run(String... args) throws Exception {

	}

}
