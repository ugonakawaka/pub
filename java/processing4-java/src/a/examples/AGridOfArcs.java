package a.examples;

import java.util.Iterator;

import processing.core.PApplet;

// 参考
// https://www.youtube.com/watch?v=hI-HCVYjZjU
public class AGridOfArcs extends PApplet {
	public static void main(String args[]) {

		PApplet.main(AGridOfArcs.class, new String[] {});
	}

	public void settings() {
		size(900, 900);
	}

	int bg = 0xff000000;
	int fg = 0xffff0000;

	public void setup() {

		
	}

	public void draw() {
		background(bg);
		fill(fg);
		noStroke();
		float tilesX = 4;
		float tilesY = tilesX;
		float tileW = width / tilesX;
		float tileH = height / tilesY;
		for (int x = 0; x < tilesX; x++) {
			for (int y = 0; y < tilesY; y++) {
				float posX = tileW * x;
				float posY = tileH * y;

				float wave = sin(radians(frameCount + x * 10 + y * 10));
				float mappedWave = map(wave, -1, 1, 0, 5);
				int selector = (int) mappedWave;
				pushMatrix();
				translate(posX, posY);

				switch (selector) {
				case 0:
					arc(0, 0, tileW, tileH, radians(0), radians(90));
					break;
				case 1:
					arc(tileW, 0, tileW * 2, tileH * 2, radians(90), radians(180));
					break;
				case 2:
					arc(tileW, tileH, tileW * 2, tileH * 2, radians(180), radians(270));
					break;
				case 3:
					arc(0, tileH, tileW * 2, tileH * 2, radians(270), radians(360));
					break;
				default:
					rect(0,0,tileW, tileH);
				}
				// ellipse(0, 0, 50, 50);
				// arc(0, 0, tileW, tileH,radians(0), radians(90));
				// arc(tileW, 0, tileW * 2, tileH * 2, radians(90), radians(180));
				// arc(tileW, tileH, tileW * 2, tileH * 2, radians(180), radians(270));
				// arc(0, tileH, tileW * 2, tileH * 2, radians(270), radians(360));
				popMatrix();

			}

		}

	}
}
