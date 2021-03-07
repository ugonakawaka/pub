package sample.config;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@Configuration
public class EnvironmentConfiguration {

	public interface BatchEnvironment {
		final ConfigurableEnvironment configurableEnvironment = new StandardEnvironment();

		public default Map<String, Object> getEnv() {
			return configurableEnvironment.getSystemEnvironment();
		}

		public default Map<String, String> getEnv(String regex) {

			final Map<String, String> map = new TreeMap<>();

			configurableEnvironment.getSystemEnvironment().forEach((k, v) -> {

				if (k.matches(regex))
					map.put(k, String.valueOf(v));

			});

			return map;
		}

	}

	@Bean
	public BatchEnvironment getBatchEnvironment() {

		return new BatchEnvironment() {
		};
	}

}
