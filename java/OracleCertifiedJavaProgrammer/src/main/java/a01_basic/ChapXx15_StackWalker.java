package a01_basic;

import java.lang.StackWalker.Option;

public class ChapXx15_StackWalker {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		// StackWalkerはjava9からあるらしい
		// どこから呼ばれた
		var stackWalker = StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE);

		stackWalker.forEach(c -> {
			System.out.println(c);

		});
		System.out.println(stackWalker.getCallerClass());

	}

	static class Aaa {

		static void a() {

		}

	}
}
