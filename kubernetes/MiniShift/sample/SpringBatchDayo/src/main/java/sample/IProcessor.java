package sample;

import org.springframework.batch.item.ItemProcessor;


public interface IProcessor<I, O> extends ItemProcessor<I, O> {

}
