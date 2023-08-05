package a05_io;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Chap18_Files_walk {

	public static void main(String[] args) throws IOException {
		a();
	}

	public static void a() throws IOException {

		/*
		 * Files使う時は、開けたら閉じるを忘れずに streamに本当に注意！
		 */
		var start = Path.of("/tmp");
		{
			try (var stream = Files.walk(start, FileVisitOption.FOLLOW_LINKS)) {
				stream.forEach(System.out::println);
			}

			try (var stream = Files.walk(start)) {
				stream.forEach(System.out::println);
			}
		}
		{ // ファイル名だけを集めたい

			// これだとスコープめんど
			try (var stream = Files.walk(start, FileVisitOption.FOLLOW_LINKS)) {

				var list = stream.peek(System.out::println).filter(p -> p.toFile().isFile()).peek(System.out::println)
						.map(p -> p.toFile().getName()).collect(Collectors.toList());
				System.out.println(list);
				// stream.forEach(System.out::println);
			}

		}
		{ // ファイル名だけを集めたい

			// Filesのメソッドで、あけたらとじないといけないものについて
			// Filesのメソッドの取り扱いは、直で使うよりユーティリティメソッドにしたほうがよいんだろうか。。。
			// ここでは匿名なオブジェクトでやってみた
			var list = new Object() {

				List<String> get() throws IOException {
					try (var stream = Files.walk(start, FileVisitOption.FOLLOW_LINKS)) {

						return stream.peek(System.out::println).filter(p -> p.toFile().isFile())
								.peek(System.out::println).map(p -> p.toFile().getName()).collect(Collectors.toList());
					}
				}
			}.get();
			System.out.println(list);
		}
	}

}
