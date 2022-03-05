package a08_annotaion;

// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/08/chapter_02
public class Chap02_kihon {

	
	// マーカーインターフェイス
	@interface IamMarker {
		
	}
	
	
	// =========
	static class Value {
		@IamMarker
		String ok;
		
		@IamMarker
		String ok() {
			return "ok";
		}
	}
	
	public static void main(String[] args) {
		
		Value value = new Value();
		
		
	}
	
}
