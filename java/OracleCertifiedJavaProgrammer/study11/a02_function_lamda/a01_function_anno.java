package a02_function_lamda;

import java.util.concurrent.Executor;

public class a01_function_anno {
// ちょっと意味不明なったけど実験

	@FunctionalInterface
	interface ThrowException {
		boolean a() throws Exception;
	}

	@FunctionalInterface
	interface Exec {

		void exec(boolean b, ThrowException c) throws Exception;
	}

	public static void main(String[] args) throws Exception {
		a();
	}

	static void a() throws Exception {

		ThrowException aTrue = () -> true;
		ThrowException aFalse = () -> false;

		ThrowException aThrow = () -> {
			throw new Exception();

			// return true;
		};
		Exec exec = (a, b) -> {
			b.a();
		};
		exec.exec(true, aThrow);

	}
}
