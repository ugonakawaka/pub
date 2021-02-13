package sample;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ResourceUtils;

import sample.custom.IamConverter;

public class Main02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// Spring Java config
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		context.register(BaseJobConfigMaker.class);
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
			Job job = (Job) context.getBean("firstBatchJob2");

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
	}

}
