package a07_generics;

import java.util.Enumeration;

public class ChapXx03_interface {

	public static void main(String[] args) {

		A a = new A() {
		};

		B b = new B<A>() {
		};
		C c = new C() {
		};

		System.out.println(b);

		System.out.println(b instanceof A);
		System.out.println(c instanceof B);
	}

	interface A {

	}

	interface B<C extends A> {

	}

	interface C extends B {

	}

}