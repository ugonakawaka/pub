package a1114_PrintinOrder;

import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		var print = new Print();

		var foo = new Foo();

		var run1 = (Runnable) () -> {
			try {
				foo.first(() -> {
					print.first();
				});
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};
		var run2 = (Runnable) () -> {
	
			try {
				foo.second(() -> {
					print.second();
				});
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};
		var run3 = (Runnable) () -> {
			
			try {
				foo.third(() -> {
					print.third();
				});
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};

		// foo.first(run1);

		var map = new LinkedHashMap<>();
		map.put("3", run3);
		map.put("2", run2);
		map.put("1", run1);
		
		
		
		

		map.forEach((a, b) -> {

			System.out.println(a);
			var th = new Thread((Runnable) b);
			th.start();
		});
//		
//		var th3 = new Thread(run3);
//		var th2 = new Thread(run2);
//		var th1 = new Thread(run1);
//		
//	
//		
//		
//		th3.run();
//		th2.run();
//		th1.run();

	}

}
