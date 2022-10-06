package main;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;
import org.apache.logging.log4j.core.util.Cancellable;
import org.apache.logging.log4j.core.util.ShutdownCallbackRegistry;
import org.apache.logging.log4j.spi.LoggerContextShutdownAware;

public class TestDontLogging4_success2 {

	public static class Shutdown implements ShutdownCallbackRegistry, Serializable {

		private static final long serialVersionUID = 1L;

		@Override
		public Cancellable addShutdownCallback(Runnable callback) {
			System.out.println("*** 何もしない！");
			return null;
		}

	}

	static {
		System.out.println("*** static init");
		// ためしに、何もしないレジストリを設定みると
		System.setProperty("log4j.shutdownCallbackRegistry", "main.TestDontLogging4_success2$Shutdown");

	}
	static final Logger logger = LogManager.getLogger("Logger");

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {

		{ // 自前セッティング
			var source = new ConfigurationSource(
					Files.newInputStream(Path.of("src/main/resources/log4j2_myconverter.xml")));
			final var xmlConfig = new XmlConfiguration(null, source);
			var loggerContext = (LoggerContext) LogManager.getContext(false);
			loggerContext.start(xmlConfig);

			loggerContext.addShutdownListener(new LoggerContextShutdownAware() {

				@Override
				public void contextShutdown(org.apache.logging.log4j.spi.LoggerContext loggerContext) {
					System.out.println("*** called shutdown...");

				}
			});
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
				// ここのログがでることを確認
				logger.info("ここログでない... ;_;");
				logger.info("うそー  でたよ！>_<!");
				System.out.println("起きた!");
			}

		}));

		System.exit(0);
	}

}
