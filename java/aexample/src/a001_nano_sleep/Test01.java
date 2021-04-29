package a001_nano_sleep;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {

		final int[] nano_sleep = { 999999, 99999, 9999, 999, 99, 9 };

		for (int i : nano_sleep) {
			System.out.println("=========>" + i);
			a(i);
			b(i);
			System.out.println("");
		}

	}

	static void a(final int nano_sleep) throws InterruptedException {
		final long l1 = System.nanoTime();
		Thread.sleep(0, nano_sleep);
		final long l2 = System.nanoTime();

		System.out.printf("%d %d %07d%n", l1, l2, l2 - l1);

	}

	static void b(final int nano_sleep) throws InterruptedException {

		final long l1 = System.nanoTime();

		{
			long start = System.nanoTime();
			while (start + nano_sleep >= System.nanoTime())
				;
		}
		final long l2 = System.nanoTime();

		System.out.printf("%d %d %07d%n", l1, l2, l2 - l1);

	}
}
