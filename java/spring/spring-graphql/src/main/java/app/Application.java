package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.graphql.server.webmvc.GraphiQlHandler;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Configuration
//	public static class GraphiQlConfiguration {
//
//		@Bean
//		@Order(0)
//		public RouterFunction<ServerResponse> graphiQlRouterFunction() {
//			RouterFunctions.Builder builder = RouterFunctions.route();
//			ClassPathResource graphiQlPage = new ClassPathResource("graphiql/index.html");
//			GraphiQlHandler graphiQLHandler = new GraphiQlHandler("/graphql", "", graphiQlPage);
//			builder = builder.GET("/graphiql", graphiQLHandler::handleRequest);
//			return builder.build();
//		}
//	}
}