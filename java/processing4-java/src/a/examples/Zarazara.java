package a.examples;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Zarazara extends PApplet {
	
	// 参考
	// https://openprocessing.org/sketch/875086
	
	public static void main(String args[]) {

		PApplet.main(Zarazara.class, new String[] {});
	}

	int[] COL = { 0xff60435F, 0xff8AA8A1, 0xffcbcbd4, 0xffD1B490, 0xffEE7B30 };
	PGraphics bg;

	public void settings() {
		size(640, 360);

	}

	public void setup() {
		background(255);

		bg = createGraphics(width, height);
		bg.beginDraw();
		bg.background(255, 20f);
		bg.noStroke();
		for (var i = 0; i < 300000; i++) {
			var x = random(width);
			var y = random(height);
			var s = noise(x * 0.01f, y * 0.01f) * 2;
			bg.fill(240, 50);
			bg.rect(x, y, s, s);
		}
		bg.endDraw();

	}

	public void draw() {
		randomSeed(0);

		noStroke();
		for (var i = 0; i < 25; i++) {

			fill(COL[(int) random(COL.length)]);
			var s = random(20, 40) * (random(1, 2) + (sin(frameCount / 100 + random(100)) + 1) * 0.5);
			var x = (random(width) + frameCount * random(1, 10)) % (width + s) - s;
			var y = (random(height) + sin(frameCount / 100) * height * random(0.2f, 1) + height) % (height + s) - s;
			ellipse((float) x, (float) y, (float) s, (float) s);
		}
		image(bg, 0, 0);
	}

}
