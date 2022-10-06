package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;

/**
 * 
 * 
 * 
 *
 */
public class TestDontLogging {

	static final Logger logger = LogManager.getLogger("Logger");

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {

		{ // 自前セッティング
			var source = new ConfigurationSource(
					Files.newInputStream(Path.of("src/main/resources/log4j2_myconverter.xml")));
			var xmlConfig = new XmlConfiguration(null, source);
			var loggerContext = (LoggerContext) LogManager.getContext(false);
			loggerContext.start(xmlConfig);
		}

		logger.info("ok");
		logger.info("ok");

		/*
		 * この使い方はよくなくてログの出力は、副作用(side effect)があると思うんだよねー
		 */
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			try {
				logger.info("眠るよ！... 0_0!");
				System.out.println("眠ります！Zzzzz...");
				// なんかクリーナップ処理
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				logger.info("ここログでない... ;_;");
				System.out.println("起きた!");
			}

		}));

		System.exit(0);
	}

}
