package a17_csv;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class A00_okigaru {

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {
		// いつの時代にもあるフォーマット
		// キー、バリューのmap用意しておいて、キーがCSVのタイトルのイメージ
		// マップに値都度プットして、そのvalueをダブルクォーティションで囲んで、出力する
		// エスケープは意識しない

		// String[] title = {"aaaa", "bbbb", "cccc"};

		{
			var map = new LinkedHashMap<String, String>();
			List.of("aaa", "bbb", "ccc").stream().forEach(s -> map.put(s, null));
			System.out.println(map);
			// ヘッダーの出力

			var header = map.keySet().stream().collect(Collectors.joining(","));
			System.out.println(header);

			// 3行追加
			final var max = 3;
			for (int i = 0; i < max; i++) {
				map.put("aaa", String.valueOf(i));
				map.put("bbb", String.valueOf(i));
				map.put("ccc", String.valueOf(i));

				var body = map.values().stream().map(s -> String.format("\"%s\"", s)).collect(Collectors.joining(","));
				System.out.println(body);
			}
		}

		{ // いまいちかな ファイル出力意識してみる

			
			
			try (Closeable closeable = () -> {}) { // 最後にクローズするよ！って感じ

				// これが出力する本体イメージかな
				Consumer<String> output = s -> {
					System.out.println(s);
				};

				// BiConsumer<T, U>
				
				var map = new LinkedHashMap<String, String>();
				List.of("aaa", "bbb", "ccc").stream().forEach(s -> map.put(s, null));

				var header = map.keySet().stream().collect(Collectors.joining(","));
				output.accept(header);

				// 3行追加
				final var max = 3;
				for (int i = 0; i < max; i++) {
					map.put("aaa", String.valueOf(i));
					map.put("bbb", String.valueOf(i));
					map.put("ccc", String.valueOf(i));

					var body = map.values().stream().map(s -> String.format("\"%s\"", s))
							.collect(Collectors.joining(","));
					
					output.accept(body);
				}
				
			}
		}

	}
}
