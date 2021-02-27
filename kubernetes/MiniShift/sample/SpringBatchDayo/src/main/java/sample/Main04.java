package sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.config.DataSourceConfiguration;
import sample.config.SpringBatchConfig;
import sample.defaults.IBaseProcessor;
import sample.defaults.IBaseReader;
import sample.defaults.IBaseWriter;

public class Main04 {

	public static void main(String[] args) throws ClassNotFoundException {
		// Spring Java config
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBatchConfig.class);
		context.register(BaseJobConfigMaker.class);
		context.register(DataSourceConfiguration.class);
		context.scan("sample.custom", "sample.defaults");
		context.refresh();

		final IBaseReader reader = (IBaseReader) context.getBean("IamNonStopReader");
		final IBaseProcessor processor = (IBaseProcessor) context.getBean("baseProcessor");
		final IBaseWriter writer = (IBaseWriter) context.getBean("iamDoNothingWriter");

		final JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		final BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);

		final Step step = baseJobConfigMaker.step("test", /* chunk size */3, reader, processor, writer);

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
