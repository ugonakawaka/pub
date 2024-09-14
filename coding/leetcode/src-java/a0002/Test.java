package a0002;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		b();
		c();
		d();
		e();
	}

	static void e() {

		a("aab");

	}

	static void d() {

		a("pwwkew");

	}

	static void c() {

		// a("");
		a("b");
		a("bb");
		a("bbb");
		a("bbb");
		a("bbbb");

	}

	static void b() {

		// a("");
		a("a");
		a("ab");
		a("abc");
		a("abca");
		a("abcab");
		a("abcabc");
		a("abcabcbb");
	}

	static int a(String s) {
		if (s.length() == 0)
			return 0;
		var set = new LinkedHashSet<String>();

		
		char[] cs = s.toCharArray();
		var appender = "";
		for (int i = 0; i < s.length(); i++) {
			
			appender = appender + cs[i];
			if (i + 1 >= s.length() ||  set.contains(cs[i+1] + "")) {
				set.add(appender);
			} else {
				
				appender = "";
			}
			
			
			
		}

		System.out.println(set);
		return 0;
	}

	static void a_(String s) {

		var set = new LinkedHashSet<String>();

		set.add(s.substring(0, 1));
		for (int i = 0; i < s.length(); i++) {
			var k = i;
			for (int j = i + 1; j < s.length(); j++) {

				var s1 = s.substring(i, j + 1);
				var s3 = s.substring(j, j + 1);

				boolean b = set.stream().anyMatch(s2 -> {

					return s2.contains("" + s3);
				});

				if (!b) {
					set.add(s1);

				}
				k = j - 1;

			}
			i = k;
		}

		System.out.println(set);
		// System.out.println(set.size());

		var n = set.stream().max((c1, c2) -> {
			return c1.length() > c2.length() ? 1 : -1;
		}).get().length();
		// System.out.println(n);

	}
}
