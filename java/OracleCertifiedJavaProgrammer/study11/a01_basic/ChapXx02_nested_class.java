package a01_basic;

public class ChapXx02_nested_class {
	// いままで内部クラスといいかたしていたけど、staticのネストしたクラスいうのが正しいと思う
	static class Aaa {
		// その型が意味をもつ文脈において、論理的に関連する型を定義するための仕組みを提供する
		// トップレベルのクラスと同様な振る舞いをする
		// 外部から使う場合は、この場合は
		// Chap02_nested_class.Aaa として宣言するのがよい
		// あるクラスに関連されたクラスであるということがはっきりわかる
		
	}
	
	
	
	// これが内部クラス
	// 
	class BbbInertClass {
		
	}
	
	
}
