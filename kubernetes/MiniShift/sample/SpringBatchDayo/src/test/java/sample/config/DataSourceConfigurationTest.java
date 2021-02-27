package sample.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sample.config.DataSourceConfiguration.DataSource001Property;

@SpringBootTest
class DataSourceConfigurationTest {

	@Autowired
	DataSourceConfiguration dataSourceConfiguration;

	@Autowired
	DataSource001Property prop;

	@Test
	void test() {
		System.out.println(prop.driver);
		System.out.println(prop.name);
	}

}
