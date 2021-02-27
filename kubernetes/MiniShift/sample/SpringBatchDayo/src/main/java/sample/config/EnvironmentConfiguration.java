package sample.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

@Configuration
public class EnvironmentConfiguration {

	public interface BatchEnvironment {
		final ConfigurableEnvironment configurableEnvironment = new StandardEnvironment();
		 
		public default Map<String, Object> getEnv() {
			return configurableEnvironment.getSystemEnvironment();
		}
		

	}

	@Bean
	public BatchEnvironment getBatchEnvironment() {
		
		return new BatchEnvironment() {
		};
	}
		
	
}
