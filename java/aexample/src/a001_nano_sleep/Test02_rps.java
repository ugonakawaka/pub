package a001_nano_sleep;

public class Test02_rps {

	public final static long NANOS = 1000000000;

	public static void main(String[] args) throws InterruptedException {

		// RPS
		// 1秒間 に5000回処理を行いたい
		// すると(1 * 0.0002)秒
		final int rps = 5000;
		// System.out.println(nanos(rps));
		final long l1 = System.nanoTime();
		exec(rps, new Runnable() {

			@Override
			public void run() {
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}

			}
		});
		System.out.println("");
		final long l2 = System.nanoTime();
		System.out.printf("%d %d %07d (%f)sec%n", l1, l2, l2 - l1, ((l2 - l1) / (NANOS * 1.)));
	}

	static void exec(int rps, Runnable runnable) {
		final long nanoSleep = nanos(rps);

		for (int i = 0; i < rps; i++) {
			b(nanoSleep, runnable);
		}

	}

	static long nanos(int rps) {

		return (int) (a(rps) * NANOS);
	}

	static double a(int rps) {
		return 1. / rps;
	}

	static void b(final long nano_sleep, Runnable runnable) {

		final long l1 = System.nanoTime();

		{

			long start = System.nanoTime();

			new Thread(runnable).start();

			if (nano_sleep > (start - l1)) { //
				while (start + nano_sleep >= System.nanoTime())
					;
			}
		}

	}
}
