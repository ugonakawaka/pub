package a01_basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;


public class ChapXx12_simpledateformat_notthreadsafe {

	// 道具立てとして、例外を外にださないラムダを用意しておきます。
	static Runnable silentRunnable(String name, Runnable r) {
		return new Runnable() {

			@Override
			public void run() {
				try {
					r.run();
				} catch (Throwable th) {
					System.err.printf("test name %s%n", name);
					// どのようなエラーか知りたいよ
					th.printStackTrace();
				}
			}
		};
	}

	public static void main(String[] args) {

		//
		final var PATTERN = "yyyy-MM-dd'T'HH:mm:ss";
		final var DATE_SRC = "2022-06-25T10:22:11";

		{ // formatメソッドがスレッドセーフではない検証

			var command = (Runnable) () -> {
				// この使い方はスレッド安全(スレッドセーフ)
				int i = 0;
				try {

					for (; i < 100; i++) {
						new SimpleDateFormat(PATTERN).parse(DATE_SRC);
					}

				} catch (ParseException e) {
					throw new RuntimeException(e);
				} finally {
					System.out.printf("試行回数%d%n", i);
				}

			};
			c(silentRunnable("この使い方はスレッド安全(スレッドセーフ)", command), 10);
		}

		{
			final var FORMAT = new SimpleDateFormat(PATTERN);
			var command = (Runnable) () -> {
				// この使い方はスレッド安全(スレッドセーフ)ではない
				int i = 0;
				try {
					for (; i < 100; i++) {
						FORMAT.parse(DATE_SRC);
					}
				} catch (ParseException e) {
					// maybe java.lang.NumberFormatException occured
					throw new RuntimeException(e);
				} finally {
					System.out.printf("試行回数%d%n", i);
				}

			};
			c(silentRunnable("この使い方はスレッド安全(スレッドセーフ)ではない ", command), 10);

		}
		{//

			var command = (Runnable) () -> {
				// この使い方はスレッド安全(スレッドセーフ)
				// 都度インスタンスを作成している

				int i = 0;
				try {
					for (; i < 100; i++) {
						// 1. 日付を生成
						// 2. インスタンスを作成したSimpleDateFormatでフォーマット
						// 3. インスタンスを作成したSimpleDateFormatでフォーマット
						// 4. 2と3で比較して同じになればOK そうでないならRuntimeを発生させる
						final var NOW = new Date();

						var s0 = new SimpleDateFormat(PATTERN).format(NOW);
						var s1 = new SimpleDateFormat(PATTERN).format(NOW);
						if (!s0.equals(s1)) {
							throw new RuntimeException(String.format("%s != %s ", s0, s1));
						}
					}
				} finally {
					System.out.printf("試行回数%d%n", i);
				}

			};

			c(silentRunnable("format検証", command), 10);
		}

		{//
			final var FORMAT = new SimpleDateFormat(PATTERN);
			var command = (Runnable) () -> {
				// この使い方はスレッド安全(スレッドセーフ)ではない
				// ループの回数を増やすとでやすいかも
				int i = 0;
				try {
					for (; i < 2000; i++) {
						// 1. 日付を生成
						// 2. インスタンスを作成したSimpleDateFormatでフォーマット
						// 3. インスタンスを使い回すSimpleDateFormatでフォーマット
						// 4. 2と3で比較して同じになればOK そうでないならRuntimeを発生させる
						final var NOW = new Date();

						var s0 = new SimpleDateFormat(PATTERN).format(NOW);
						var s1 = FORMAT.format(NOW);
						if (!s0.equals(s1)) {
							throw new RuntimeException(String.format("%s != %s ", s0, s1));
						}
					}
				} finally {
					System.out.printf("試行回数%d%n", i);
				}
			};
			c(silentRunnable("format検証 インスタンスの使い回し", command), 40);
		}

	}

	static void c(Runnable command, int numberOfThreads) {

		var executor = Executors.newCachedThreadPool();

		for (int i = 0; i < numberOfThreads; i++) {
			executor.execute(command);
		}
		executor.shutdown();
		// 終わるまでまつつもり
		while (!executor.isShutdown())
			;
		System.out.println("ok");
	}

}
