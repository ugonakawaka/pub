package sample.defaults;

import java.util.List;
import java.util.Map;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component("baseReader")
public class BaseReader implements IBaseReader {

	
	@Override
	public List<Map<String, Object>> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

}
