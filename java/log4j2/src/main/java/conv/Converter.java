package conv;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.util.PerformanceSensitive;

@Plugin(name = "conv", category = "Converter")
@ConverterKeys({ "conv" })
@PerformanceSensitive
public class Converter extends LogEventPatternConverter {

	public Converter(String[] options) {
		super("MyConverter", null);
	}

	public static Converter newInstance(final String[] options) {
		return new Converter(options);
	}

	@Override
	public void format(LogEvent event, StringBuilder toAppendTo) {
		toAppendTo.append("o_o! conv");
	}

}
