package sidestory;

public class A002_メソッド名の取得 {
	static class Utils {
		static String methodName() {

			try {
				throw new Exception();
			} catch (Exception e) {
				StackTraceElement[] stackTraceElements = e.getStackTrace();
//				for (StackTraceElement stackTraceElement : stackTraceElements) {
//					System.out.println(stackTraceElement);
//				}
				return stackTraceElements[1].getClassName() + "::" + stackTraceElements[1].getMethodName();
			}

		}
	}

	static class MyClass {

		public void process() {
			System.out.printf("*** enter %s%n", Utils.methodName());

			System.out.printf("*** exit %s%n", Utils.methodName());
		}
	}

	public static void main(String[] args) {
		a();
	}

	static void a() {
		System.out.printf("*** enter %s%n", Utils.methodName());
		var myClass = new MyClass();
		myClass.process();

		System.out.printf("*** exit %s%n", Utils.methodName());
	}

}
