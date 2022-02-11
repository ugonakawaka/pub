package a.examples;

import processing.core.PApplet;

public class EmbeddingIteration extends PApplet {
	public static void main(String args[]) {

		var name = EmbeddingIteration.class.getCanonicalName();

		PApplet.main(new String[] { name });
	}

	int barWidth = 20;
	int lastBar = -1;

	public void settings() {
		size(640, 360);
	}

	public void setup() {

		background(0);
	}

	public void draw() {
		int gridSize = 30;

		for (int x = gridSize; x <= width - gridSize; x += gridSize) {
			for (int y = gridSize; y <= height - gridSize; y += gridSize) {
				noStroke();
				fill(255);
				rect(x - 1, y - 1, 3, 3);
				stroke(255, 100);
				line(x, y, width / 2, height / 2);
			}
		}
	}

}
