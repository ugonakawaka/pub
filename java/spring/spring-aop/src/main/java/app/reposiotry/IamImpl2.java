package app.reposiotry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import app.test2.Iam2;


@Component
public class IamImpl2 implements Iam2 {

	public String name() {
		return "o_o! 2";
	}

	@Override
	public String ng() {
		if (true)
			throw new RuntimeException(">_<! 2");
		return null;
	}
}
