package a01_basic;

import java.util.function.Supplier;

public class ChapXx00_aaa {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		{

			var calcB = (Supplier<Boolean>) ()->{
				System.out.println("*** called");
				return true;
			};
			
			
			var b = false;
			var a = b || calcB.get();
			
			System.out.println(a);
		}
		{
			var b = false;
			var a = b || calcB();
			
			System.out.println(a);
			
		}
		
		{ // 挙動の確認
			String[] ss = {"o_o"};
			write(ss);
			for (String s : ss) {
				System.out.println(s);
			}
			
			
		}

	}
	
	public static boolean calcB() {
		return true;
	}
	
	public static void write(String[] ss) {
		if (!(ss.length > 0)) {
			return;
		}
		ss[0] = "!!" + ss[0] + "!!";
	}
}
