package a14_enum;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Chap07_enum_magicnumber {

	/*
	 * これぐらいなら用意はできるが 0001とかとなると、このパターンでやるのはどうか...
	 */
	enum SCode {
		S0("0"), S00("00"), S1("1"), S01("01"), S2("2"), S02("02"), S3("3"), S03("03"), S4("4"), S04("04"), S05("05"),
		S5("5"), S06("06"), S6("6"), S7("7"), S07("07"), S8("8"), S08("08"), S09("09"), S9("9"), S10("10"), S11("11"),
		S12("12"), S13("13"), S14("14"), S15("15"), S16("16"), S17("17"), S18("18"), S19("19"), S20("20"), S21("21"),
		S22("22"), S23("23"), S24("24"), S25("25"), S26("26"), S27("27"), S28("28"), S29("29"), S30("30"), S31("31"),
		S32("32"), S33("33"), S34("34"), S35("35"), S36("36"), S37("37"), S38("38"), S39("39"), S40("40"), S41("41"),
		S42("42"), S43("43"), S44("44"), S45("45"), S46("46"), S47("47"), S48("48"), S49("49"), S50("50"), S51("51"),
		S52("52"), S53("53"), S54("54"), S55("55"), S56("56"), S57("57"), S58("58"), S59("59"), S60("60"), S61("61"),
		S62("62"), S63("63"), S64("64"), S65("65"), S66("66"), S67("67"), S68("68"), S69("69"), S70("70"), S71("71"),
		S72("72"), S73("73"), S74("74"), S75("75"), S76("76"), S77("77"), S78("78"), S79("79"), S80("80"), S81("81"),
		S82("82"), S83("83"), S84("84"), S85("85"), S86("86"), S87("87"), S88("88"), S89("89"), S90("90"), S91("91"),
		S92("92"), S93("93"), S94("94"), S95("95"), S96("96"), S97("97"), S98("98"), S99("99"),;

		final String code;

		SCode(String code) {
			this.code = code;
		}
	}

	// ===================================
	// ===================================
	// ===================================

	// 小道具
	interface EqString {
		public boolean eqS(String s);
	}

	enum Num2 {

		// enumの定義を外のenumでおこなってるパターン
		ONE(SCode.S01), TWO(SCode.S02), THREE(SCode.S03);

		final SCode scode;

		Num2(SCode scode) {
			this.scode = scode;
		}

		// この定数に含まれれいるかのチェック
		// メソッド名がこれがいいか悩み中
		public static boolean contains(String code) {
			return EnumSet.allOf(Num2.class).stream().anyMatch(n -> n.scode.code == code);
		}

		public static boolean contains(SCode code) {
			return EnumSet.allOf(Num2.class).stream().anyMatch(n -> n.scode == code);
		}
	}

	public static void main(String[] args) {
		{
			var c = (Consumer<String>) (s) -> {
				System.out.printf("%s %s %n", Num2.contains(s), s);
			};

			c.accept("001");
			c.accept("02");
			c.accept("03");
		}
		{
			var c = (Consumer<SCode>) (s) -> {
				System.out.printf("%s %s %n", Num2.contains(s), s);
			};

			c.accept(SCode.S0);
			c.accept(SCode.S01);
			c.accept(SCode.S99);
		}

		IntStream.range(0, 100).forEach(i -> {
			String a = String.format("S%d(\"%d\")", i, i);
			String b = String.format("S%02d(\"%02d\")", i, i);

			Set<String> set = new HashSet<>(Arrays.asList(a, b));

			set.forEach(s -> {
				System.out.printf("%s,", s);
			});

		});
		// System.out.println();

	}
}
