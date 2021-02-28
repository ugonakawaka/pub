package sample.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sample.config.DataSourceConfiguration.Property01;

@SpringBootTest
class DataSourceConfigurationTest {

	@Autowired
	DataSourceConfiguration dataSourceConfiguration;

	@Autowired
	Property01 prop;

	@Test
	void test() {
		System.out.println(prop.driver);
		System.out.println(prop.name);
	}

}
