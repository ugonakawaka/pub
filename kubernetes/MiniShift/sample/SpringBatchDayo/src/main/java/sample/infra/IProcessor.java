package sample.infra;

import org.springframework.batch.item.ItemProcessor;


public interface IProcessor<I, O> extends ItemProcessor<I, O> {

	public static IProcessor INSTANCE() { 
		return null;
	}
}
