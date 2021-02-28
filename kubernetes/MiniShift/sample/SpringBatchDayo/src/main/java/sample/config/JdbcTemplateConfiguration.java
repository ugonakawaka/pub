package sample.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateConfiguration {

	@Bean
	public JdbcTemplate jdbcTemplate01(DataSource dataSource01) {
		return new JdbcTemplate(dataSource01);
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate02(DataSource dataSource02) {
		return new JdbcTemplate(dataSource02);
	}
	
}
