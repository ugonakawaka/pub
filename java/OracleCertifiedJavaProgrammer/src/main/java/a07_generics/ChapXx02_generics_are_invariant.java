package a07_generics;

import java.util.ArrayList;
import java.util.List;

public class ChapXx02_generics_are_invariant {

	public static void main(String[] args) {

		a();
	}

	static void a() {

		{ // ジェネリックは不変(invariant)
			// これはコンパイルできない
			// 型に互換性がない
			// Type mismatch: cannot convert from ArrayList<String> to List<Object>
			// List<Object> list = new ArrayList<String>();
		}

		{ // 配列は共変(covariant)
			// 配列では、コンパイル時に検出できない
			Object[] objects = new String[10];
			// ava.lang.ArrayStoreException: java.lang.Integer
			objects[0] = 123; // 実行時にエラーとなる
		}
	}
}
