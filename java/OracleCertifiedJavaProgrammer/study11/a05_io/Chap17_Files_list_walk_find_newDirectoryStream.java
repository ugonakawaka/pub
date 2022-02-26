package a05_io;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Chap17_Files_list_walk_find_newDirectoryStream {

	public static void main(String[] args) throws IOException {
		a();
	}

	@FunctionalInterface
	interface $$ {
		public void apply() throws IOException;
	}

	static void printer(String partition, $$... as) {
		for ($$ a : as) {
			System.out.println(partition);
			try {
				a.apply();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void a() throws IOException {
		Path dir = Paths.get(".");
		{ // list
			Files.list(dir).forEach(System.out::println);
		}
		printer("@@@@@@@@@@@@", () -> { // list
			Files.list(dir).forEach(System.out::println);
		}, () -> { // walk
			{
				Files.walk(dir).forEach(System.out::println);
			}
			{
				Files.walk(dir, 0).forEach(System.out::println);
			}
		}

		);

	
		{ // find
			BiPredicate<Path, BasicFileAttributes> matcher = (p, attr) -> {

				return !attr.isDirectory() && p.endsWith("*.txt");
			};
			Files.find(dir, 4, matcher).forEach(System.out::println);

		}
	}

}
