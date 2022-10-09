package a01_basic;

public class ChapXx17_finally_systemexit {

	public static void main(String[] args) {
		// a();
		// b();
		// c();
		// d();
		e();
	}

	static void a() {

		// ちょっとした疑問これはどういう結果になるのだろう。
		try {
			System.out.println("さあ落ちるぞ！");
			System.exit(0);
		} finally {
			System.out.println("この行は実行されるのか");
		}

	}

	static void b() {

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			try {
				System.out.println("眠ります！Zzzzz...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			} finally {
				System.out.println("起きた!");
			}

		}));

		// ちょっとした疑問これはどういう結果になるのだろう。
		try {
			System.out.println("さあ落ちるぞ！");
			System.exit(0);
		} finally {
			System.out.println("この行は実行されるのか");
		}

	}

	static void c() {
		// これはどういう結果になる？

		new Thread(() -> {
			System.out.println("1.わたしこれから寝るのです Zzzzz");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("2.*** 起きたよ！");
		}).run();

		System.out.println("3.わたしexitします！");
		System.exit(0);
	}

	static void d() {
		// あまりおもしろくない
		new Thread(() -> {
			System.out.println("わたしこれから寝るのです Zzzzz");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("*** 起きたよ！");
			System.exit(0);
		}).run();

		System.out.println("わたしexitします！");
		System.exit(0);
	}

	static void e() {
		// 想像通り
		new Thread(() -> {
			new Thread(() -> {
				try {
					System.out.println("1.わたしこれから寝るのです Zzzzz");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("2.*** 起きたよ！");
			}).run();

			System.out.println("3.わたしexitします！");
			System.exit(0);
		}).run();

	}
}
