package sample;

import javax.sql.DataSource;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class SpringConfig {

//	@Value("org/springframework/batch/core/schema-drop-sqlite.sql")
//	private Resource dropReopsitoryTables;
//
//	@Value("org/springframework/batch/core/schema-sqlite.sql")
//	private Resource dataReopsitorySchema;
//
//	@Bean
//	public DataSource dataSource01() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.sqlite.JDBC");
//		dataSource.setUrl("jdbc:sqlite:repository.sqlite");
//		return dataSource;
//	}

//	@Bean
//	public DataSourceInitializer dataSourceInitializer(DataSource dataSource) throws MalformedURLException {
//		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//
//		databasePopulator.addScript(dropReopsitoryTables);
//		databasePopulator.addScript(dataReopsitorySchema);
//		databasePopulator.setIgnoreFailedDrops(true);
//
//		DataSourceInitializer initializer = new DataSourceInitializer();
//		initializer.setDataSource(dataSource);
//		initializer.setDatabasePopulator(databasePopulator);
//
//		return initializer;
//	}

	private JobRepository getJobRepository() throws Exception {
		JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
		factory.setDataSource(dataSource());
		factory.setTransactionManager(getTransactionManager());
		factory.afterPropertiesSet();
		return (JobRepository) factory.getObject();
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager getTransactionManager() {
		return new ResourcelessTransactionManager();
	}

	@Bean(name = "jobLauncher")
	public JobLauncher getJobLauncher() throws Exception {
		final SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
		jobLauncher.setJobRepository(getJobRepository());
		jobLauncher.afterPropertiesSet();
		return jobLauncher;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public DataSource dataSource() {

		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL)
				.addScript("classpath:/org/springframework/batch/core/schema-hsqldb.sql").build();
	}
}