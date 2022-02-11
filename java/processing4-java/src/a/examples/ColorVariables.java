package a.examples;

import processing.core.PApplet;

// https://processing.org/examples/colorvariables.html
public class ColorVariables extends PApplet {
	public static void main(String args[]) {

		var name = ColorVariables.class.getCanonicalName();

		PApplet.main(new String[] { name });
	}

	public void settings() {
		size(640, 360);
	}

	public void setup() {
		noStroke();
		background(51, 0, 0);
	}

	public void draw() {
		noStroke();
		int inside = color(204, 102, 0);
		int middle = color(204, 153, 0);
		int outside = color(153, 51, 0);

		// These statements are equivalent to the statements above.
		// Programmers may use the format they prefer.
		// color inside = #CC6600;
		// color middle = #CC9900;
		// color outside = #993300;

		pushMatrix();
		translate(80, 80);
		fill(outside);
		rect(0, 0, 200, 200);
		fill(middle);
		rect(40, 60, 120, 120);
		fill(inside);
		rect(60, 90, 80, 80);
		popMatrix();

		pushMatrix();
		translate(360, 80);
		fill(inside);
		rect(0, 0, 200, 200);
		fill(outside);
		rect(40, 60, 120, 120);
		fill(middle);
		rect(60, 90, 80, 80);
		popMatrix();
	}

}
