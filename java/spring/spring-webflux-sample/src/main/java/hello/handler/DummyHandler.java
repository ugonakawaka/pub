package hello.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import hello.dao.DummyDao;
import hello.dto.Dummy;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DummyHandler {

	@Autowired
	DummyDao dao;

	public Mono<ServerResponse> dummies(ServerRequest serverRequest) {
		Flux<Dummy> flux = dao.getDummieStream();
		return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM).body(flux, Dummy.class);
	}
	
	public Flux<Dummy> dummieStream() {
		return dao.getDummieStream();
	}
}
