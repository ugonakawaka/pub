package sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.support.SimpleJobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ResourceUtils;

import sample.config.DataSourceConfiguration;
import sample.config.EnvironmentConfiguration;
import sample.config.SpringBatchConfig;
import sample.custom.IamConverter;
import sample.infra.IProcessor;

public class Main02 {

	public static void main(String[] args) throws ClassNotFoundException {

		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBatchConfig.class);
		context.register(DataSourceConfiguration.class);
		context.register(EnvironmentConfiguration.class);
		context.scan("sample.custom");
		context.refresh();

	}

}
