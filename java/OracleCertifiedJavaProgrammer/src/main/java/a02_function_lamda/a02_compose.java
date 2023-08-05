package a02_function_lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class a02_compose {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		var itos = (Function<Integer, String>) a02_compose::itos;
		var println = (Consumer<String>) System.out::println;

		// ちょっと自分自身何がしたいがわかっていないが、ためしてみて、何を自分がしたいか考えてみたい..
		{
			var sup = supplier(itos, 777);
			var r = compose(sup, println);

			// 何度でもできるイメージ
			r.run();
			r.run();
			r.run();
		}
		{
			
			
			var sup = supplier(itos, 888);
			var r = compose(sup, println.andThen(println));

			// 何度でもできるイメージ
			r.run();
		}
	}

	public static String itos(int i) {
		return "" + i;
	}

	public static <L, R> Supplier<R> supplier(Function<L, R> f, L l) {
		return () -> {
			return f.apply(l);
		};
	}

	public static <R> Runnable compose(Supplier<R> s, Consumer<R> c) {

		return () -> {

			c.accept(s.get());

		};
	}

}
