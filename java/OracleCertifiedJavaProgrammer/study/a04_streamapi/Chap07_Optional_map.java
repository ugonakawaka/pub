package a04;

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
			s2.ifPresent(a -> {
				System.out.println(a);
			});
		}

		{
			String s = null;
			var s2 = Optional.ofNullable(s).map(a -> {
				return a.toUpperCase();
			});
			s2.ifPresent(a -> {
				System.out.println(a);
			});
		}

		{
			String s = "a";
			var opt = Optional.ofNullable(s).map(a -> {
				return a.toUpperCase();
			});
			opt.ifPresent(a -> System.out.println(a));
		}

		{
			String s = "a";
			var opt = Optional.ofNullable(s).map(a -> {
				return new Result().set(a);
			});
			opt.ifPresent(a -> System.out.println(a));

		}

		{
			var arr = new String[] { "a", "b" };
			Optional.ofNullable(arr).map(a -> {
				return a.length;
			}).ifPresent(a -> System.out.println(a));
		}

	}

}
