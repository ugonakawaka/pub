package a01_basic;

public class ChapXx05_enum {

	public static void main(String[] args) {
		a();
	}

	public enum Operation {

		PLUS("+") {
			@Override
			public double apply(double x, double y) {
				return x + y;
			}
		},
		MINUS("-") {
			@Override
			public double apply(double x, double y) {
				return x - y;
			}
		};

		final String symbol;

		Operation(String symbol) {
			this.symbol = symbol;
		}

		public abstract double apply(double x, double y);
	}

	static class NumInt {
		public static final int ONE = 1;
		public static final int TWO = 2;
	}

	static class NumString {
		public static final String ONE = "ONE";
		public static final String TWO = "TWO";
	}

	enum NumEnum {
		ONE(1), TWO(2);

		public final int code;

		NumEnum(int code) {
			this.code = code;
		}
	}

	// enumを使ってみよう！
	static void a() {
		// [JLS ,8.9]
		// int enum pattern
		// String enum pattern

		{
			System.out.printf("%s%n", NumInt.ONE == NumEnum.ONE.code);
			System.out.printf("%s%n", NumInt.TWO == NumEnum.TWO.code);
			
			System.out.printf("%s%n", NumString.ONE.equals(NumEnum.ONE.name()));
			System.out.printf("%s%n", NumString.TWO.equals(NumEnum.TWO.name()));

		}

	}

}
