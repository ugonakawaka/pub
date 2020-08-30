package z_grpc;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by alexf on 28-Jan-16.
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// SpringApplication.run(App.class, args);

		SpringApplication app = new SpringApplication(App.class);
		// 6565
		// app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
		app.run(args);
	}

}