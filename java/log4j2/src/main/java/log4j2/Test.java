package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;

/**
 * デフォルトs
 * 
 *
 */
public class Test {

	protected static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		a();
	}

	static void a() {

		logger.info("test");

		logger.debug("test");

	}
}
