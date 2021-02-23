package sample.defaults;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("baseProcessor")
@Scope("prototype")
public class BaseProcessor implements IBaseProcessor {

	// private static Log logger = LogFactory.getLog("item.error");
	
	@Override
	public List<Map<String, Object>> process(List<Map<String, Object>> item) throws Exception {

		return item;
	}

}
