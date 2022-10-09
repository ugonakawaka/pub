package a01_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ChapXx14_combination {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		final var list = Arrays.asList("01", "02", "03", "04", "05", "06");

		{// 6C2
			var cnt = 0;

			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					cnt++;
					System.out.printf("%d %s %s%n", cnt, list.get(i), list.get(j));
				}
			}

		}
		System.out.println();
		{// 6C3
			var cnt = 0;

			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					for (int k = j + 1; k < list.size(); k++) {
						cnt++;
						System.out.printf("%d %s %s %s%n", cnt, list.get(i), list.get(j), list.get(k));
					}

				}
			}

		}
		{
			System.out.println();

			final var r = 3;
			var combi = new Object() {

				List<String> list(List<String> l, String s) {
					var l2 = new ArrayList<>(l);
					l2.add(s);
					return l2;
				}

				void func(int pos, int n, List<String> l) {
					for (int i = pos; i < list.size(); i++) {

						if (n < r) {
							// System.out.print(list.get(i) + " ");
							func(i + 1, n + 1, list(l, list.get(i)));
							continue;
						}

						System.out.println(list(l, list.get(i)));
					}
				}
			};

			combi.func(0, 1, Collections.emptyList());
		}
		{
			System.out.println();

			final var r = 3;
			var combi = new Object() {

				List<String> list(List<String> l, String s) {
					var l2 = new ArrayList<>(l);
					l2.add(s);
					return l2;
				}

				void calc(int pos, int n, List<String> l) {
					for (int i = pos; i < list.size(); i++) {

						if (n < r) {
							// System.out.print(list.get(i) + " ");
							calc(i + 1, n + 1, list(l, list.get(i)));
							continue;
						}

						System.out.println(list(l, list.get(i)));
					}
				}
			};

			combi.calc(0, 1, Collections.emptyList());
		}
	}

}
