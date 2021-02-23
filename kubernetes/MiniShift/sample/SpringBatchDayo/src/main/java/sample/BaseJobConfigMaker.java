package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import sample.custom.IamConverter;
import sample.defaults.IBaseProcessor;
import sample.defaults.IBaseReader;
import sample.defaults.IBaseWriter;

public class BaseJobConfigMaker {
	@Autowired
	JobBuilderFactory jobs;

	@Autowired
	StepBuilderFactory steps;

	
	
	
	@Value("input/record.csv")
	private Resource inputCsv;

	@Value("file:xml/output.xml")
	private Resource outputXml;

	ItemProcessor processor = new IamConverter();

//	@Bean
//	public ItemReader<Transaction> itemReader() throws UnexpectedInputException, ParseException {
//		FlatFileItemReader<Transaction> reader = new FlatFileItemReader<Transaction>();
//		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
//		String[] tokens = { "username", "userid", "transactiondate", "amount" };
//		tokenizer.setNames(tokens);
//		reader.setResource(inputCsv);
//		DefaultLineMapper<Transaction> lineMapper = new DefaultLineMapper<Transaction>();
//		lineMapper.setLineTokenizer(tokenizer);
//		lineMapper.setFieldSetMapper(new RecordFieldSetMapper());
//		reader.setLineMapper(lineMapper);
//		return reader;
//	}
//
//	@Bean
//	public ItemProcessor<Transaction, Transaction> itemProcessor() {
//		return new CustomItemProcessor();
//	}
//
//	@Bean
//	public ItemWriter<Transaction> itemWriter(Marshaller marshaller) throws MalformedURLException {
//		StaxEventItemWriter<Transaction> itemWriter = new StaxEventItemWriter<Transaction>();
//		itemWriter.setMarshaller(marshaller);
//		itemWriter.setRootTagName("transactionRecord");
//		itemWriter.setResource(outputXml);
//		return itemWriter;
//	}

//	@Bean
//	public Marshaller marshaller() {
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		marshaller.setClassesToBeBound(new Class[] { Transaction.class });
//		return marshaller;
//	}

//	@Bean
//	protected Step step1(ItemReader<Transaction> reader, ItemProcessor<Transaction, Transaction> processor,
//			ItemWriter<Transaction> writer) {
//		return steps.get("step1").<Transaction, Transaction>chunk(10).reader(reader).processor(processor).writer(writer)
//				.build();
//	}

	public ItemProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(ItemProcessor processor) {
		this.processor = processor;
	}

	@Bean
	public ItemReader<Integer> itemReader() {
		return new ListItemReader<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)) {
			@Override
			public Integer read() {
				Integer item = super.read();
				System.out.println("reading item = " + item);
				return item;
			}
		};
	}

	@Bean
	public ItemWriter<Integer> itemWriter() {
		return items -> {
			System.out.println("About to write chunk: " + items);
			for (Integer item : items) {
				System.out.println("writing item = " + item);
			}
		};
	}

	public Step step(String name, int chunkSize, IBaseReader reader, IBaseProcessor processor, IBaseWriter writer) {
		return steps.get(name).<List<Map<String, Object>>, List<Map<String, Object>>>chunk(chunkSize).reader(reader)
				.processor(processor).writer(writer).build();
	}

	
	public Step step1(ItemReader reader, ItemWriter writer) {
		return steps.get("step1").chunk(10).reader(reader).processor(processor).writer(writer).build();
	}

	public Step step1(String name, ItemReader reader, ItemWriter writer) {
		return steps.get(name).chunk(10).reader(reader).processor(processor).writer(writer).build();
	}

	public Step step(String name, ItemReader reader, ItemProcessor processor, ItemWriter writer) {
		return steps.get(name).chunk(10).reader(reader).processor(processor).writer(writer).build();
	}

	//@Bean(name = "firstBatchJob")
	public Job job(@Qualifier("step1") Step step1) {

		System.out.println("*************************");
		return jobs.get("firstBatchJob").start(step1).build();
		// return jobs.get("firstBatchJob").start(step1).build();
	}

}
