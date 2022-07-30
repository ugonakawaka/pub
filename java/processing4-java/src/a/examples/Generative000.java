package a.examples;

import processing.core.PApplet;

// 参考
// https://github.com/bioerrorlog/Alife-GenerativeArt-Projects/blob/master/generative_001/generative_1_ver1.pde
public class Generative000 extends PApplet {
	public static void main(String args[]) {

		PApplet.main(Generative000.class, new String[] {});
	}

	public void settings() {
		size(1920, 1080);
	}

	public void setup() {

		background(0);

	}

	public void draw() {
		// background(0);
		strokeWeight(3.9f);
		smooth();

		int centx = width / 2;
		int centy = height / 2;
		float x, y;

		float lastx = -999;
		float lasty = -999;
		float radiusNoise = random(10);
		float radius = 10;
		stroke(255, random(100));
		int startAngle = (int) random(360);
		int endAngle = (int) (random(1440)) + 360 * 6;
		int angleStep = (int) (random(3)) + 1;
		for (float ang = startAngle; ang < endAngle; ang += angleStep) {
			radiusNoise += 0.05;
			radius += 0.6;
			float thisRadius = radius + (noise(radiusNoise) * 200) - 100;
			float rad = radians(ang);
			x = (centx + (thisRadius * cos(rad)));
			y = centy + (thisRadius * sin(rad));
			if (lastx > -999) {
				line(x, y, lastx, lasty);
			}
			lastx = x;
			lasty = y;
		}
	}

}
