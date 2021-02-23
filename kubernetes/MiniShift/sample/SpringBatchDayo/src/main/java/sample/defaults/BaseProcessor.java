package sample.defaults;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("baseProcessor")
@Scope("prototype")
public class BaseProcessor implements IBaseProcessor {

	private static final Logger logger = LoggerFactory.getLogger(BaseProcessor.class);

	@Override
	public List<Map<String, Object>> process(List<Map<String, Object>> item) throws Exception {

		return item;
	}

}
