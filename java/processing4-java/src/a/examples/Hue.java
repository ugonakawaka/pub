package a.examples;

import processing.core.PApplet;

public class Hue extends PApplet {
	public static void main(String args[]) {

		var name = Hue.class.getCanonicalName();

		PApplet.main(new String[] { name });
	}

	int barWidth = 20;
	int lastBar = -1;

	public void settings() {
		size(640, 360);
	}

	public void setup() {
		colorMode(HSB, height, height, height);
		noStroke();
		background(0);
	}

	public void draw() {
		int whichBar = mouseX / barWidth;
		if (whichBar != lastBar) {
			int barX = whichBar * barWidth;
			fill(mouseY, height, height);
			rect(barX, 0, barWidth, height);
			lastBar = whichBar;
		}
	}

}
