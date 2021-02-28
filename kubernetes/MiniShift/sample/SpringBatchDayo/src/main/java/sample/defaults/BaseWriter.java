package sample.defaults;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("baseWriter")
public class BaseWriter implements IBaseWriter {

	@Override
	public void write(List<? extends List<Map<String, Object>>> items) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
