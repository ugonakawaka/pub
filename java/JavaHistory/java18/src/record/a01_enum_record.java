package record;

public class a01_enum_record {

	public static class Const {

	}

	// ISO 5218
	// https://ja.wikipedia.org/wiki/ISO_5218
	public static enum Iso5218 {
//	0 	not known 	不明
//	1 	male 	男性
//	2 	female 	女性
//	9 	not applicable 	適用不能

		NOT_KNOWN(new Sex(0, "not known", "不明")), MALE(new Sex(1, "male", "男性")), FEMALE(new Sex(2, "female", "女性")),
		NOT_APPLICABLE(new Sex(2, "not applicable", "適用不能"));

		public final Sex sex;

		Iso5218(Sex sex) {
			this.sex = sex;
		}
	}

	public record Sex(int code, String dataElement, String dataElementJa) {

	}

	public static void main(String[] args) {
		a();
	}

	static void a() {
		// アイデア
		// enumのコンストラクタの引数をレコードにしてしまって、値のペアを表現してみる
		// recordを使うと自然に不可変を表現できる
	}
}
