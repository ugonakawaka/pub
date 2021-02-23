package sample.infra;

import org.springframework.batch.item.ItemWriter;

public interface IWriter<T> extends ItemWriter<T> {

}
