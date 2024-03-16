package a04_streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class ChapXx03_StreamSupport {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		// Iteratorからstreaｍをつくる
		// 先入れ先出しをイメージしている
		
		final String[] ss = { "aa", "bb", "cc", "dd" };

		Iterator<String> iterator = new Iterator<String>() {

			final LinkedList<String> list = new LinkedList<>(Arrays.asList(ss));

			@Override
			public String next() {
				return list.pollFirst();
			}

			@Override
			public boolean hasNext() {
				return list.size() > 0;
			}
		};
		
		var spliterator = Spliterators.<String>spliteratorUnknownSize(iterator, 0);
		var stream = StreamSupport.<String>stream(spliterator, false);
		
		stream.forEach(System.out::println);
		

	}
}
