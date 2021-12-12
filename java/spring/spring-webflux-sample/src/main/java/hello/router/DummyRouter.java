package hello.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import hello.handler.DummyHandler;

@Configuration
public class DummyRouter {

	
	@Autowired
	DummyHandler dummyHandler;
	
	@Bean
	public RouterFunction<ServerResponse> routerDummy() {
		return RouterFunctions.route().GET("/dummy", dummyHandler::dummies).build();
	}
}
