package a01_basic;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class ChapXx20_string {

	public static void main(String[] args) {
		a();
		a_matches();
	}

	static void a_matches() {
		// Stringのmatchesは使わない方がよいという意見です。
		// ↓　
		{
			var s = """
					aaaa
					bbbb
					cccc
					""";
			{
				System.out.println(s);
				{

					var b = s.matches(".*a*.*");
					System.out.println(b); // false
				}
				{
					var b = s.matches(".*b*.*");
					System.out.println(b); // false
				}
				{ // DOTALLつけるとマッチする
					var b = Pattern.compile(".*a*.*", Pattern.DOTALL).matcher(s).matches();
					System.out.println(b); // true
				}
				
			}
		}

		{ // 改行がない文字列ならマッチする
			// 理由はおそらく、matchesの内部ではPatternを使っていて、その初期かがどうなんだろう
			var s = "aaaa bbbb cccc";
			{
				System.out.println(s);
				{

					var b = s.matches(".*a*.*");
					System.out.println(b); // true
				}
				{
					var b = s.matches(".*b*.*");
					System.out.println(b); // true
				}
			}
		}
	}

	static void a() {
		// string関連

		String[] ss = { "a", "b", "c" };
		{ //

			{ //
				var joiner = new StringJoiner(",");
				joiner.add("1").add("2").add("3");
				System.out.println(joiner); // 1,2,3
			}
			{
				var joiner = new StringJoiner(",");
				List.of(ss).stream().forEach(joiner::add);
				System.out.println(joiner); // 1,2,3
			}

		}
		{
			//
			StringWriter writer = new StringWriter();

		}

	}

}
