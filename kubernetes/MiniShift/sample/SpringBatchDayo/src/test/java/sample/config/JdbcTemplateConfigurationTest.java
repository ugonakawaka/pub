package sample.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class JdbcTemplateConfigurationTest {

	
	@Autowired
	JdbcTemplate jdbcTemplate01;
	@Autowired
	JdbcTemplate jdbcTemplate02;
	
	@Test
	void test() {
		// fail("Not yet implemented");
//		jdbcTemplate01.queryForList("select 1");
//		jdbcTemplate02.queryForList("select 1");
//		

		
		assertNotSame(jdbcTemplate01.getDataSource(), jdbcTemplate02.getDataSource());
		assertNotSame(jdbcTemplate02.getDataSource(), jdbcTemplate01.getDataSource());
		
	}

}
