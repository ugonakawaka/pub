package z_grpc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by alexf on 28-Jan-16.
 */
@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App2.class);
		Map defaultProperties = new HashMap<String, Object>();
		defaultProperties.put("server.port", "8081");
		defaultProperties.put("grpc.port", "6566");
		app.setDefaultProperties(defaultProperties);
		app.run(args);
	}

}