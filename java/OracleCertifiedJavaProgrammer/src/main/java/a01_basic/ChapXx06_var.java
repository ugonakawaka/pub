package a01_basic;

public class ChapXx06_var {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		// 「コードの可読性が向上し、必要なボイラープレート・コードの量が削減される」ということらしい
		{ // NG
			Object obj = new Object() {
				String test() {
					return "ok";
				}
			};
			// これはコンパイルできない
			// System.out.println(obj.test());
		}

		{ // OK
			// うう、これがほしかった！
			var obj = new Object() {
				String test() {
					return "ok";
				}
			};

			System.out.println(obj.test());
		}

		{
			{// varは予約語ではない
				var var = "ok";
				System.out.println(var);

			}

			{
				// varはクラス名には使えない
				// ng class var {}
				class Var {
				}

				var var = new Var() {
					String msg = "ok";

					String ok() {
						return msg;
					}
				};
				System.out.println(var.ok());
			}

		}
	}
}
