package sample.infra;

import org.springframework.batch.item.ItemReader;

public interface IReader<T> extends ItemReader<T> {

}
