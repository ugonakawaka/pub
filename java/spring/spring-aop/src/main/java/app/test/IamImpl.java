package app.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class IamImpl implements Iam {

	public String name() {
		return "o_o!";
	}

	@Override
	public String ng() {
		if (true)
			throw new RuntimeException(">_<!");
		return null;
	}
}
