package log4j2.converter;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;

@Plugin(name = "myconv", category = "Converter")
@ConverterKeys({ "myconv" })
public class MyConverter extends LogEventPatternConverter {

	public MyConverter(String[] options) {
		super("MyConverter", null);
	}

	public static MyConverter newInstance(final String[] options) {
		return new MyConverter(options);
	}

	@Override
	public void format(LogEvent event, StringBuilder toAppendTo) {
		toAppendTo.append("o_o!");
	}

}
