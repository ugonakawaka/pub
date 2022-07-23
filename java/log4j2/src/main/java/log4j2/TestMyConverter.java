package log4j2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;

public class TestMyConverter {

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {

		{
			var source = new ConfigurationSource(Files.newInputStream(Path.of("src/main/resources/log4j2_myconverter.xml")));
			var xmlConfig = new XmlConfiguration(null, source);
			var loggerContext = (LoggerContext) LogManager.getContext(false);
			loggerContext.start(xmlConfig);
		}
		Logger logger = LogManager.getLogger();
		logger.info("ok");
		logger.info("ok");
	}
}
