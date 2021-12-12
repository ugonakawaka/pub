package hello.dao;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.dto.Dummy;
import reactor.core.publisher.Flux;

@Component
public class DummyDao {

	public Flux<Dummy> getDummieStream() {
		return Flux.range(1, 10).delayElements(Duration.ofSeconds(1)).doOnNext(i -> {
			System.out.println(i + "=>");
		}).map(i -> new Dummy("i am " + i));
	}
}
