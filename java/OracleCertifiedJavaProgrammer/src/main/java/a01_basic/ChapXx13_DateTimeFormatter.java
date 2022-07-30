package a01_basic;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChapXx13_DateTimeFormatter {

	public static void main(String[] args) {
		a();
		b_iso();
	}

	static void b_iso() {
		// https://ja.wikipedia.org/wiki/ISO_8601
		// 基本形式(20220713T130410+0900 ) 拡張形式(2022-07-13T13:04:10+09:00)

		{ // デフォルトでISOのパターンが定義されているので適用してみよう

			var patterns = Stream.of(DateTimeFormatter.BASIC_ISO_DATE);

			var time = ZonedDateTime.now();
			
		
			
		}

	}

	static void a() {
		// まともに使ったことがなかったのでお試し
		// パッケージ java.time.format
		// パッケージ java.time.temporal
		{
			// LocalDate + LocalTime = LocalDateTime ということ？
			Stream<Temporal> stream = Stream.of(LocalDate.now(), LocalTime.now(), LocalDateTime.now());
			// var bbb =

			// Stream.of(LocalDate.now(), LocalTime.now(), LocalDateTime.now())
			// 1.
			// 2.
			final var PATTERN = "yyyyMMdd";
			var formatter = DateTimeFormatter.ofPattern(PATTERN);
			// TemporalAccessor
			final var NOW = LocalDateTime.now(); // システム・クロックから現在のインスタントを取得
			System.out.println(NOW);

			var formatter2 = (Function<Temporal, String>) (t) -> {
				try {
					return formatter.format(t);
				} catch (Throwable th) {
					System.err.println(th);

					return "(err)";
				}

			};

			// var s = formatter.format(NOW);
			// System.out.println(s);
			// var f = formatter::format;
			Stream.of(LocalDate.now(), LocalTime.now(), LocalDateTime.now()).forEach(System.out::println);
			var c = stream.peek(System.out::println).map(formatter2).peek(System.out::println)
					.collect(Collectors.toList());
			System.out.println(c);
		}

	}

}
