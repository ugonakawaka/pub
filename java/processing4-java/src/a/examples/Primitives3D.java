package a.examples;

import processing.core.PApplet;

public class Primitives3D extends PApplet {
	public static void main(String args[]) {

		var name = Primitives3D.class.getCanonicalName();

		PApplet.main(new String[] { name });
	}

	int barWidth = 20;
	int lastBar = -1;

	public void settings() {
		size(640, 360, P3D);
	}

	public void setup() {
		background(0);
		
		lights();
	}

	public void draw() {
		noStroke();
		pushMatrix();
		translate(130, height / 2, 0);
		rotateY(1.25f);
		rotateX(-0.4f);
		box(100);
		popMatrix();

		noFill();
		stroke(255);
		pushMatrix();
		translate(500f, height * 0.35f, -200);
		sphere(280);
		popMatrix();
	}

}
