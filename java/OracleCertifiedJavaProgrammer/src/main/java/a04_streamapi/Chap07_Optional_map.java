package a04_streamapi;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Chap07_Optional_map {

	static class Result {
		public String s;

		public Result set(String s) {
			this.s = s;
			return this;
		}

		public String toString() {
			return s;
		}
	}

	public static void main(String[] args) {

		{
			String s = null;
			var s2 = Optional.ofNullable(s);
			s2.ifPresent(System.out::println);
		}

		{

			var s = Optional.ofNullable(null);
			// String s2 = s.orElse("(null)");
			// これができない理由は↑では型が推論できないから
			var s2 = s.orElse("(null)");
			System.out.println(s2);
		}
		{
			// これは型がわかる
			var s = Optional.<String>ofNullable(null);
			String s2 = s.orElse("(null)");
			System.out.println(s2);
		}
		{
			// これは型がわかる
			Optional<String> s = Optional.ofNullable(null);
			String s2 = s.orElse("(null)");
			System.out.println(s2);
		}
		{
			var s = Optional.ofNullable(null).orElse("(null)");
			System.out.println(s);
		}
		{
			String s = Optional.<String>ofNullable(null).orElse("(null)");
			System.out.println(s);
		}
		{
			try {
				var s = Optional.ofNullable(null).orElseThrow();
				System.out.println(s);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
		{
			try {
				var s = Optional.ofNullable(null).orElseThrow(() -> new Exception("(exception)"));
				System.out.println(s);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		{
			String s = null;
			var s2 = Optional.ofNullable(s).map(a -> {
				return a.toUpperCase();
			});
			s2.ifPresent(System.out::println);
		}

		{
			String s = "a";
			var opt = Optional.ofNullable(s).map(a -> {
				return a.toUpperCase();
			});
			opt.ifPresent(System.out::println);
		}

		{
			String s = "a";
			var opt = Optional.ofNullable(s).map(a -> {
				return new Result().set(a);
			});
			opt.ifPresent(System.out::println);

		}

		{
			var arr = new String[] { "a", "b" };
			Optional.ofNullable(arr).map(a -> {
				return a.length;
			}).ifPresent(System.out::println);
		}

		{

		}

	}

}
