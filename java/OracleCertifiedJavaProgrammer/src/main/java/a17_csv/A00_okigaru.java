package a17_csv;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class A00_okigaru {

	public static void main(String[] args) {
		a();
	}

	static void a() {
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
	}
}
