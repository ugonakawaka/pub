package a04;

import java.util.Optional;

public class Chap08_Optional_flatmap {

	public static void main(String[] args) {

		{
			String s = null;
			var s2 = Optional.ofNullable(s);
			s2.ifPresent(System.out::println);
		}

		{
			String s = "a";
			var opt = Optional.ofNullable(s).flatMap(a -> {
				return Optional.of(a.toUpperCase());
			});
			opt.ifPresent(System.out::println);
		}
		{
			var arr = new String[] { "a", "b" };
			Optional.ofNullable(arr).map(a -> {
				return a.length;
			}).ifPresent(System.out::println);
		}

	}

}
