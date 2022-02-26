package a01_basic;


// overloadingが正しい
// overloadは意味がちがう単語
public class ChapXx04_override_overloading {

	interface Aaa {
		void a(Object o);

		void b(String o);
	}

	static class Bbb implements Aaa {

		public void a(String o) {
			System.out.println("string:" + o);
		}

		@Override
		public void a(Object o) {
			System.out.println("object:" + o);

		}

		@Override
		public void b(String o) {
			System.out.println(o);
		}

		public void b(Object o) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		a();
	}

	static void a() {
		Bbb bbb = new Bbb();
		bbb.a("ok");
		bbb.a((Object)"ok");
	}
}
