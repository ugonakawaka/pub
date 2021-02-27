package sample.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import sample.config.EnvironmentConfiguration.BatchEnvironment;

@SpringBootTest
class EnvironmentConfigurationTest {

	@Autowired
	EnvironmentConfiguration environmentConfiguration;

	@Autowired
	BatchEnvironment batchEnvironment;

	@Autowired
	Environment environment;

	final ConfigurableEnvironment configurableEnvironment = new StandardEnvironment();

	@Test
	void test() {

		// fail("Not yet implemented");
		batchEnvironment.getEnv().forEach((s, o) -> {
			System.out.println(s);
		});
	}

	@Test
	void testXxx() {
		MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
		propertySources.remove(StandardEnvironment.SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME);
		System.out.println("=============");
		configurableEnvironment.getSystemEnvironment().forEach((s, o) -> {
			System.out.println(s);
		});
		System.out.println("=============");
		configurableEnvironment.getSystemProperties().forEach((s, o) -> {
			System.out.println(s);
		});
		System.out.println("=============");

		{
			String s = environment.getProperty("sample.db001.jdbc.driver");
			System.out.println(s);
		
		}
		{
			String s = environment.getProperty("${sample.db001.jdbc.driver}");
			System.out.println(s);
		
		}
		{
			
			String s = configurableEnvironment.getProperty("${sample.db001.jdbc.driver}");
			System.out.println(s);
		
		}
		{
			String s = configurableEnvironment.getProperty("sample.db001.jdbc.driver");
			System.out.println(s);
		
		}
		{
			String s = configurableEnvironment.getProperty("SAMOLE_DB001_JDBC_DRIVER");
			System.out.println(s);
		
		}
		{
			String s = environment.getProperty("SAMOLE_DB001_JDBC_DRIVER");
			System.out.println(s);
		
		}

	}

}
