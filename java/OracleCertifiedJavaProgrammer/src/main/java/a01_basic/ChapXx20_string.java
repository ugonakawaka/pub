package a01_basic;

import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

public class ChapXx20_string {

	public static void main(String[] args) {
		a();
	}
	
	static void a() {
		// string関連
		
		String[] ss = {"a", "b", "c"};
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
		
	}

}
