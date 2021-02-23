package sample.custom;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sample.defaults.IBaseReader;

@Component("IamNonStopReader")
@Scope("prototype")
public class IamNonStopReader implements IBaseReader {

	public int count = 0;

	public int limit = 10;

	public int bulksize = 10;

	@Override
	public List<Map<String, Object>> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		if (limit < count) {
			return null;
		}

		final List<Map<String, Object>> list = new ArrayList<>();

		IntStream.range(0, bulksize).forEach(a -> {
			String s = String.format("count:%d pos:%d", count, a);
			list.add(map(s));
		});

		count = count + 1;
		return list;
	}

	Map<String, Object> map(String s) {

		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("col1", 1);
		map.put("col2", s);
		map.put("col3", Double.valueOf(0.0));
		return map;
	}

}
