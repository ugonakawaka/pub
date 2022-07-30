package a;

import processing.core.PApplet;

public class FuncDeProcessingTransform extends PApplet {

	@FunctionalInterface
	interface Action {
		void apply();
	}

	public Action translate(float x, float y, Action a) {

		return () -> {
			translate(x, y);
			a.apply();
		};
	}

	public Action rotate(float angle, Action a) {

		return () -> {

			rotate(angle);
			a.apply();
		};
	}

	public Action scale(float s, Action a) {

		return () -> {

			scale(s);
			a.apply();
		};
	}

	public Action matrix(Action a) {
		return () -> {
			pushMatrix();
			a.apply();
			popMatrix();
		};
	}

	public static void main(String args[]) {

		PApplet.main(FuncDeProcessingTransform.class, new String[] {});
	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		// noLoop();
	}

	public void draw() {
		background(0);

		if (false){
			Action action = () -> {
				rect(0, 0, 100, 100);
			};

			matrix(translate(300, 100, translate(100, 0, rotate(PI / 3.0f, action)))).apply();
			matrix(translate(0, 100, translate(0, 0, rotate(PI / 3.0f, action)))).apply();
			pushMatrix();
			translate(100, 100, translate(100, 0, rotate(PI / 3.0f, action))).apply();
			popMatrix();
			pushMatrix();
			translate(200, 100, rotate(PI / 3.0f, action)).apply();
			popMatrix();
		}

		// translate(300, 300, translate(10, 30, rotate(PI / 3.0f, action))).apply();

		if (false){
			colorMode(HSB, 360, 256, 256);

			noStroke();
			smooth();
			rectMode(CENTER);
			Action action = () -> {

				fill(random(0, 90), 255, 255, 51);
				rect(0, 0, 10, 10);
			};
			for (int i = 0; i < 100; i++) {

//				matrix(scale(random(0.5f, 5), rotate(random(PI / 2), translate(random(width), random(height), action))))
//						.apply();

				matrix(translate(random(width), random(height), scale(random(0.5f, 5), rotate(random(PI / 2), action))))
						.apply();

			}
		}
		{
			noStroke();
			Action star = () -> {
				ellipse(random(width), random(height), 30, 30);
				fill(255, 255, 0);
				  beginShape();
				    vertex(  0,-20);
				    vertex(-12, 15);
				    vertex( 18, -8);
				    vertex(-18, -8);
				    vertex( 12, 15);
				  endShape(CLOSE);
			};
			// star.apply();
			for (int i = 0; i < 100; i++) {
				matrix(translate(random(width), random(height), star)).apply();
			}
			

		}
	}

}