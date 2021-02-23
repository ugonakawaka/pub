package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

import sample.custom.IamConverter;
import sample.defaults.IBaseProcessor;
import sample.defaults.IBaseReader;
import sample.defaults.IBaseWriter;
import sample.infra.IProcessor;

public class Main04 {

	public static void main(String[] args) throws ClassNotFoundException {
		// Spring Java config
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		context.register(BaseJobConfigMaker.class);
		context.register(DataSourceConfiguration.class);
		context.scan("sample.custom", "sample.defaults");
		context.refresh();

		final IBaseReader reader = (IBaseReader) context.getBean("IamNonStopReader");
		final IBaseProcessor processor = (IBaseProcessor) context.getBean("baseProcessor");
		final IBaseWriter writer = (IBaseWriter) context.getBean("iamDoNothingWriter");

		final JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		final BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);

		final Step step = baseJobConfigMaker.step("test", 3, reader, processor, writer);

		final Job job = baseJobConfigMaker.job(step);

		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Job Status : " + execution.getStatus());
			System.out.println("Job completed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Job failed");
		}
	}

}
