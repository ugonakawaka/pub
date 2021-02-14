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

public class Main03 {

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

		class DataHolder {
			String name;
			IProcessor processor;
		}

		// 実験
		final List<DataHolder> steps = new ArrayList<>();
		IntStream.range(0, 2).forEach(i -> {
			DataHolder d = new DataHolder();
			d.name = "test" + i;
			d.processor = context.getBean("iamconverter", IProcessor.class);
			steps.add(d);

		});

		steps.forEach(data -> {
			final BaseJobConfigMaker baseJobConfigMaker = context.getBean(BaseJobConfigMaker.class);
			final Step step = baseJobConfigMaker.step(data.name, baseJobConfigMaker.itemReader(), data.processor,
					baseJobConfigMaker.itemWriter());
			final Job job = baseJobConfigMaker.job(step);
			try {
				JobExecution execution = jobLauncher.run(job, new JobParameters());
				System.out.println("Job Status : " + execution.getStatus());
				System.out.println("Job completed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Job failed");
			}
		});
	}

}
