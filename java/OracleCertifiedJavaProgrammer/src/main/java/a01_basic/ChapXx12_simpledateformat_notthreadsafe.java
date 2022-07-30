package a01_basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

// 2022.06.26
// このコード正直だめなようなので、ちょっと書き直しましょう
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

	static void time(String title, BiConsumer<Runnable, Integer> consumer, Runnable command, int numberOfThreads) {
		final var start = System.currentTimeMillis();
		try {
			consumer.accept(command, numberOfThreads);
		} finally {
			System.out.printf("%s\t%f sec%n", title, (System.currentTimeMillis() - start) / 1000.);
		}
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

					for (; i < 10000; i++) {
						new SimpleDateFormat(PATTERN).parse(DATE_SRC);
					}

				} catch (ParseException e) {
					throw new RuntimeException(e);
				} finally {
					System.out.printf("試行回数%d%n", i);
				}

			};
			var title = "parse この使い方はスレッド安全(スレッドセーフ)";
			time(title, ChapXx12_simpledateformat_notthreadsafe::cexecute, command, 20);

		}

		{ // formatメソッドがスレッドセーフではない検証
			// ThreadLocalを使ってみる
			// こちらのほうが若干、性能はいいとは思う..
			// スレッド数分しかnewが発生しない
			// ThreadLocalの実装をみておいたほうがよい
			// getの内部で、内部に保持された値があれば返すように実装されているはず...
			final var TITLE = "ThreadLocalを使ってみる こちらのほうが俄然、性能はよいはず";
			var threadLocal = new ThreadLocal<SimpleDateFormat>() {
				@Override
				protected SimpleDateFormat initialValue() {
					// このメソッドは、getする際、内部に保持していない場合に呼び出されて、
					// はじめてスレッド内のキャッシュとして設定れるようになっているはず...
					// 生成する数分しか呼ばれない
					// System.out.println(Thread.currentThread());
					return new SimpleDateFormat(PATTERN);
				}

			};
			var command = (Runnable) () -> {
				// この使い方はスレッド安全(スレッドセーフ)
				int i = 0;
				try {

					for (; i < 10000; i++) {
						threadLocal.get().parse(DATE_SRC);
					}

				} catch (ParseException e) {
					throw new RuntimeException(e);
				} finally {
					System.out.printf("%s 試行回数%d%n", TITLE, i);
				}

			};

			var title = "parse threadLocal この使い方はスレッド安全(スレッドセーフ)";
			time(title, ChapXx12_simpledateformat_notthreadsafe::cexecute, command, 20);
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
			cexecute(silentRunnable("この使い方はスレッド安全(スレッドセーフ)ではない ", command), 10);

		}

		// ===============
		// ===============
		// ===============
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

			cexecute(silentRunnable("format検証", command), 10);
		}
		{//
			final var TITLE = "ThreadLocalを使ってみる こちらのほうが俄然、性能はよいはず";
			var threadLocal = new ThreadLocal<SimpleDateFormat>() {
				@Override
				protected SimpleDateFormat initialValue() {
					// このメソッドは、getする際、内部に保持していない場合に呼び出されて、
					// はじめてスレッド内のキャッシュとして設定れるようになっているはず...
					// 生成する数分しか呼ばれない
					System.out.println(Thread.currentThread());
					return new SimpleDateFormat(PATTERN);
				}

			};
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
						var s1 = threadLocal.get().format(NOW);
						if (!s0.equals(s1)) {
							throw new RuntimeException(String.format("%s != %s ", s0, s1));
						}
					}
				} finally {
					System.out.printf("%s 試行回数%d%n", TITLE, i);
				}

			};

			cexecute(silentRunnable("format検証", command), 10);
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
			cexecute(silentRunnable("format検証 インスタンスの使い回し", command), 40);
		}

	}

	static void cexecute(Runnable command, int numberOfThreads) {

		// var executor = Executors.newFixedThreadPool(30);
		var executor = Executors.newCachedThreadPool();
		for (int i = 0; i < numberOfThreads; i++) {
			executor.execute(command);
		}
		executor.shutdown();

		// ↓このコードだめっぽい?
		// 終わるまでまつつもり
		// while (!executor.isShutdown())
		;

		try {
			if (!executor.awaitTermination(60, TimeUnit.SECONDS)) { // 60秒もかからないだろう...
				executor.shutdownNow();
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

}
