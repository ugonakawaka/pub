package a01_instanceof;

import java.util.function.Consumer;

// https://docs.oracle.com/en/java/javase/14/language/pattern-matching-instanceof-operator.html
public class Test {

	public interface Shape {
	}

	final static class Rectangle implements Shape {
		final double length;
		final double width;

		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
		}

		double length() {
			return length;
		}

		double width() {
			return width;
		}
	}

	public static class Circle implements Shape {
		final double radius;

		public Circle(double radius) {
			this.radius = radius;
		}

		double radius() {
			return radius;
		}
	}

	public static void main(String[] args) {
		a();
	}

	public static double getPerimeter_(Shape shape) throws IllegalArgumentException {
		if (shape instanceof Rectangle) {
			Rectangle s = (Rectangle) shape;
			return 2 * s.length() + 2 * s.width();
		} else if (shape instanceof Circle) {
			Circle s = (Circle) shape;
			return 2 * s.radius() * Math.PI;
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}
	}

	public static double getPerimeter(Shape shape) throws IllegalArgumentException {
		if (shape instanceof Rectangle s) {
			return 2 * s.length() + 2 * s.width();
		} else if (shape instanceof Circle s) {
			return 2 * s.radius() * Math.PI;
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}
	}

	// ==============
	static void a() {

		var print = (Consumer<Double>) (d) -> {
			System.out.printf(" %f%n", d);
		};

		var circle = new Circle(20.);
		var rectangle = new Rectangle(10., 100.);
		{
			var d = getPerimeter(rectangle);
			print.accept(d);
		}
		{
			var d = getPerimeter(circle);
			print.accept(d);
		}

	}
}
