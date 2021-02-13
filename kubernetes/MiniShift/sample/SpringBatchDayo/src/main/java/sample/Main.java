package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("*** OK");
		
		
		System.exit(SpringApplication.exit(SpringApplication.run(Main.class, args)));

	}

}
