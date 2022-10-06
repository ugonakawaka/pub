package main;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LifeCycle;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;
import org.apache.logging.log4j.core.util.Cancellable;
import org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry;
import org.apache.logging.log4j.core.util.ShutdownCallbackRegistry;
import org.apache.logging.log4j.spi.LoggerContextShutdownAware;

import log4j2.StaticShutdownCallbackRegistry;

public class TestDontLogging5_success3 {

	public static class Shutdown extends DefaultShutdownCallbackRegistry {

		private static final long serialVersionUID = 1L;

		@Override
		public Cancellable addShutdownCallback(Runnable callback) {

			{ // おそらくこのクラスの処理が

				System.out.println("*** 何が登録されるかみてみよう！");
				System.out.println(callback);
				System.out.println(callback.getClass());
				System.out.println(callback.getClass().descriptorString());

			}

			// これはだめ
			// return super.addShutdownCallback(callback);
			// これでうまくいく
			return null;
		}

	}

	static {
		System.out.println("*** static init");
		// System.out.printf("%s%n",
		// ShutdownCallbackRegistry.SHUTDOWN_CALLBACK_REGISTRY);
		// System.out.printf("%s%n",
		// System.getProperty(ShutdownCallbackRegistry.SHUTDOWN_CALLBACK_REGISTRY));
		// ためしに、何もしないレジストリを設定みると
		System.setProperty("log4j.shutdownCallbackRegistry", "main.TestDontLogging5_success3$Shutdown");
//		System.setProperty("log4j.shutdownCallbackRegistry",
//				"org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry");
		// org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry

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
