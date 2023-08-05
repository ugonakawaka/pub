package a02_function_lamda;

public class a03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@FunctionalInterface
	interface f1<T> {
		T apply(T t);
	}
	
	interface f2<T> {
		f1 apply(T t);
	}
	
	interface f3<T> {
		f1 apply(T t);
	}
	
	
	
}
