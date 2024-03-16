package a04_streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ChapXx03_StreamSupport {

	public static void main(String[] args) {
		// a();
		b();
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

	static void b() {
		// 次にディレクトリの走査をおこうことイメージしてみた
		// 遅延？で処理をおこなう感じ
		// Filesのlistはstreamで返すけど
		// 方向性がた正しいかいまいち
		// 再帰を使わず、あと、streamを使ってのファイル処理をおこないたいというのがモチベーション
		//

		// 準備
		final var toList = new Function<Path, List<Path>>() {

			@Override
			public List<Path> apply(Path t) {
				try {
					return Files.list(t).collect(Collectors.toList());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

		};

		var root = Path.of("", ".");
		// System.out.println(root.toFile().getAbsolutePath());
		// System.out.println(root.toFile().listFiles());
		Iterator<Path> iterator = new Iterator<>() {

			final LinkedList<Path> list = new LinkedList<>();
			{ // アイデアがうかばないので

				// List<Path> files = Files.list(f).collect(Collectors.toList());

				System.out.println("ok");
				var _list = Stream.of(root.toFile().listFiles()).map(f -> f.toPath()).toList();
				list.addAll(_list);
				System.out.println(list);
			}

			@Override
			public boolean hasNext() {
				return list.size() > 0;
			}

			@Override
			public Path next() {
				var path = list.pollFirst();
				// とりだしたpathがディレクトリならその中をlisitして頭につっこんでおくというアイデア
				if (Files.isDirectory(path)) {
					list.addAll(0, toList.apply(path));
				}

				return path;
			}

		};
		var spliterator = Spliterators.<Path>spliteratorUnknownSize(iterator, 0);
		var stream = StreamSupport.<Path>stream(spliterator, false);
		// stream.forEach(System.out::println);

		// 特定なファイルをみつけるとか
		{
			var cnt = stream.filter(p -> Files.isRegularFile(p)).peek(System.out::println)
					.filter(p -> p.getFileName().endsWith(".java")).peek(System.out::println).count();
			System.out.printf("java source %d%n", cnt);
		}

	}
}
