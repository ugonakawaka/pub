package sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.config.DataSourceConfiguration;
import sample.config.EnvironmentConfiguration;
import sample.config.JdbcTemplateConfiguration;
import sample.config.SpringBatchConfig;

public class Main02 {

	public static void main(String[] args) throws ClassNotFoundException {

		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBatchConfig.class);
		context.register(DataSourceConfiguration.class);
		context.register(EnvironmentConfiguration.class);
		context.register(JdbcTemplateConfiguration.class);
		context.scan("sample.custom");
		context.refresh();

	}

}
