package a04_streamapi;

import java.util.Optional;

public class Chap08_Optional_flatmap {

	public static void main(String[] args) {



		{
			String s = "a";
			var opt = Optional.ofNullable(s).flatMap(a -> {
				return Optional.of(a.toUpperCase());
			});
			opt.ifPresent(System.out::println);
		}
		{
			var arr = new String[] { "a", "b" };
			var opt = Optional.ofNullable(arr).flatMap(a -> {
				return Optional.of(a.length);
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
