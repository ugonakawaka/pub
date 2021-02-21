package sample;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.util.StringUtils;

@Configuration
@PropertySource("classpath:/batch.properties")
public class DataSourceConfiguration {

	@Autowired
	private Environment environment;

	@Autowired
	private ResourceLoader resourceLoader;

	@PostConstruct
	protected void initialize() {

		String schemaScript = environment.getProperty("schema.script");
		if (StringUtils.hasLength(schemaScript)) {

			{
				ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
				populator.addScript(resourceLoader.getResource(schemaScript));
				populator.setContinueOnError(true);
				DatabasePopulatorUtils.execute(populator, dataSource01());
			}

			{
				ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
				populator.addScript(resourceLoader.getResource(schemaScript));
				populator.setContinueOnError(true);
				DatabasePopulatorUtils.execute(populator, dataSource02());
			}
		}

	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource01() {

		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getProperty("db01.jdbc.driver"));
		dataSource.setUrl(environment.getProperty("db01.jdbc.url"));
		dataSource.setUsername(environment.getProperty("db01.jdbc.user"));
		dataSource.setPassword(environment.getProperty("db01.jdbc.password"));
		return dataSource;
	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource02() {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getProperty("db02.jdbc.driver"));
		dataSource.setUrl(environment.getProperty("db02.jdbc.url"));
		dataSource.setUsername(environment.getProperty("db02.jdbc.user"));
		dataSource.setPassword(environment.getProperty("db02.jdbc.password"));
		return dataSource;
	}
}
