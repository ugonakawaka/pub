package a05_io;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * 
 */
public class Aちょっと複雑なsample {

	public static void main(String[] args) throws IOException {
		a();
	}

	static <T1, T2> void setTrhowsRuntimeExceptio(T1 target, Field field, T2 value) {
		try {
			field.set(target, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("rawtypes")
	static Optional getTrhowsRuntimeException(Object target, Field field) {
		try {
			return Optional.ofNullable(field.get(target));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	static String readTrhowsRuntimeException(Path path) {
		try {
			return Files.readString(path, Charset.forName("utf8"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	static void writeStringTrhowsRuntimeException(Path path, String string) {
		try {
			Files.writeString(path, string, Charset.forName("utf8"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	static String replace$(String s, Map<String, Field> mapOfField, Object target) {

		final String[] content = { s };
		mapOfField.entrySet().stream().forEach(entry -> {
			@SuppressWarnings("rawtypes")
			Optional optional = getTrhowsRuntimeException(target, entry.getValue());
			optional.ifPresent(val -> {
				content[0] = content[0].replace("$" + entry.getKey(), (String) val);
			});

		});

		return content[0];
	}

	static void a() throws IOException {

		class Line {
			String title;
			String a;
			String b;
			String c;

			public String toString() {
				return String.format("%s %s %s %s", title, a, b, c);
			}
		}

		var output = Paths.get("output");
		// リソースにあるテンプレートファイルをコピーするサンプル
		// a.)TSVファイルの読み込み

		// .)リソースにあるテンプレートファイル
		// a.)ディレクトリを作成、ファイルを作成
		// b.)a.のファイルをコピーして別のディレクトリに格納
		//

		final var TAB = "\t";

		var tsv = Paths.get("src/main/resources/a05_chap18.tsv");
		var templates = Paths.get("src/main/resources/templates/");
		var list = Files.readAllLines(tsv, Charset.forName("utf8"));
		var header = list.stream().findFirst().map(s -> Arrays.asList(s.split(TAB)));

		Map<String, Field> mapOfField = Stream.of(Line.class.getDeclaredFields()).map(f -> Map.entry(f.getName(), f))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		var listOfLine = new ArrayList<Line>();
		list.stream().skip(1).map(s -> Arrays.asList(s.split(TAB))).forEach(a -> {
			var line = new Line();

			header.ifPresent(h -> {
				var pos = new AtomicInteger();
				for (String s : h) {
					Optional.ofNullable(mapOfField.get(s)).ifPresent(field -> {
						var i = pos.get();
						setTrhowsRuntimeExceptio(line, field, a.get(i));
					});

					System.out.printf("%s%n", Objects.toString(line));
					pos.addAndGet(1);
				}
			});

			if (line.title != null) {
				listOfLine.add(line);
			}
		});

		listOfLine.forEach(line -> {
			// タイトルのディレクトリを作成する
			// テンプレートファイルをタイトルディレクトリに文字列置換を行ながらコピーする
			try {
				Path outdir = output.resolve(line.title);
				Files.createDirectories(outdir);

				try (var stream = Files.list(templates)) { // 
					stream.forEach(path -> {
						var rawcontent = readTrhowsRuntimeException(path);

						var content = replace$(rawcontent, mapOfField, line);

						writeStringTrhowsRuntimeException(outdir.resolve(path.getFileName()), content);

					});
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		});

	}
}
