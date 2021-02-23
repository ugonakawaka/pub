package sample.custom;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sample.defaults.IBaseWriter;



@Component("iamDoNothingWriter")
@Scope("prototype")
public class IamDoNothingWriter implements IBaseWriter {

	@Override
	public void write(List<? extends List<Map<String, Object>>> items) throws Exception {

		items.forEach(action -> {
			System.out.println(action);
		});

	}

}
