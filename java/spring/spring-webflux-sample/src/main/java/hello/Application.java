package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(exclude = {
		R2dbcAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		
		final ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		final GreetingClient greetingClient = context.getBean(GreetingClient.class);
	    // We need to block for the content here or the JVM might exit before the message is logged
	    System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
