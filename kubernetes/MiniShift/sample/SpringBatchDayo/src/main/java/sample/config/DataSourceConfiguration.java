package sample.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:/datasource.properties")
public class DataSourceConfiguration {

	@Component
	public static class Property01 {
		final static String PREFIX = "sample.db01.";

		@Value("${" + PREFIX + "driver" + "}")
		public String driver;
		@Value("${" + PREFIX + "name" + "}")
		public String name;
		@Value("${" + PREFIX + "url" + "}")
		public String url;
		@Value("${" + PREFIX + "user" + "}")
		public String user;
		@Value("${" + PREFIX + "password" + "}")
		public String password;
	}

	@Component
	public static class Property02 {
		final static String PREFIX = "sample.db02.";

		@Value("${" + PREFIX + "driver" + "}")
		public String driver;
		@Value("${" + PREFIX + "name" + "}")
		public String name;
		@Value("${" + PREFIX + "url" + "}")
		public String url;
		@Value("${" + PREFIX + "user" + "}")
		public String user;
		@Value("${" + PREFIX + "password" + "}")
		public String password;
	}

	@Autowired
	private Environment environment;

	@Autowired
	private ResourceLoader resourceLoader;

	@PostConstruct
	protected void initialize() {

		String schemaScript = environment.getProperty("schema.script");
//		if (StringUtils.hasLength(schemaScript)) {
//
//			{
//				ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//				populator.addScript(resourceLoader.getResource(schemaScript));
//				populator.setContinueOnError(true);
//				DatabasePopulatorUtils.execute(populator, dataSource01());
//			}
//
//			{
//				ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//				populator.addScript(resourceLoader.getResource(schemaScript));
//				populator.setContinueOnError(true);
//				DatabasePopulatorUtils.execute(populator, dataSource02());
//			}
//		}

	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource01(Property01 property) {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(property.driver);
		dataSource.setUrl(property.url);
		dataSource.setUsername(property.user);
		dataSource.setPassword(property.password);
		return dataSource;
	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource02(Property02 property) {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(property.driver);
		dataSource.setUrl(property.url);
		dataSource.setUsername(property.user);
		dataSource.setPassword(property.password);
		return dataSource;
	}

}
