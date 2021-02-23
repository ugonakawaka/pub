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

import sample.custom.IamConverter;
import sample.infra.IProcessor;

public class Main02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// Spring Java config
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		context.register(BaseJobConfigMaker.class);
		context.scan("sample.custom");
		context.refresh();

		final JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		{
			BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);
			System.out.println(baseJobConfigMaker);
			final String className = "sample.custom.IamConverter";
			final Class<?> clazz = Class.forName(className);
			IProcessor iamConverter = (IProcessor) BeanUtils.instantiate(clazz);
			baseJobConfigMaker.setProcessor(iamConverter);

		}
		{
			IProcessor iamConverter = context.getBean(IamConverter.class);
			System.out.println(iamConverter);
			
		}
		{
			Job job = (Job) context.getBean("firstBatchJob");

			System.out.println("Starting the batch job");
			try {
				JobExecution execution = jobLauncher.run(job, new JobParameters());
				System.out.println("Job Status : " + execution.getStatus());
				System.out.println("Job completed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Job failed");
			}
		}
		{ // 
			Job job = (Job) context.getBean("firstBatchJob");

			System.out.println("Starting the batch job");
			try {
				JobExecution execution = jobLauncher.run(job, new JobParameters());
				System.out.println("Job Status : " + execution.getStatus());
				System.out.println("Job completed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Job failed");
			}
		}
		{
			IProcessor iamConverter = context.getBean(IamConverter.class);
			System.out.println(iamConverter);
			
		}
		{
			IProcessor iamConverter = context.getBean(IamConverter.class);
			System.out.println(iamConverter);
			
		}
		{
			
			BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);
			Step step = baseJobConfigMaker.step1("test", baseJobConfigMaker.itemReader(), baseJobConfigMaker.itemWriter());
			
			Job job = baseJobConfigMaker.job(step);
			try {
				JobExecution execution = jobLauncher.run(job, new JobParameters());
				System.out.println("Job Status : " + execution.getStatus());
				System.out.println("Job completed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Job failed");
			}
		}
		{
			
			BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);
			Step step = baseJobConfigMaker.step1("test2", baseJobConfigMaker.itemReader(), baseJobConfigMaker.itemWriter());
			
			Job job = baseJobConfigMaker.job(step);
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

}
