package renshuu;

import java.util.Calendar;

import a.examples.AGridOfArcs;
import processing.core.PApplet;

public class Rensyuu00_ extends PApplet {
	public static void main(String args[]) {

		PApplet.main(Rensyuu00_.class, new String[] {});
	}

	boolean savePDF = false;

	int pointCount;
	int freq = 1;
	float phi = 0;

	float angle;
	float y;

	boolean doDrawAnimation = true;

	public void settings() {
		size(800, 400);
	}

	public void setup() {
		smooth();
		arc(50, 55, 50, 50, 0, HALF_PI);
		noFill();
		arc(50, 55, 60, 60, HALF_PI, PI);
		arc(50, 55, 70, 70, PI, PI + QUARTER_PI);
		arc(50, 55, 80, 80, PI + QUARTER_PI, TWO_PI);

	}

	public void draw() {
		if (savePDF)
			beginRecord(PDF, timestamp() + ".pdf");

		background(255);
		stroke(0);
		strokeWeight(2);
		noFill();
//		{
//			translate(40, 30); // 座標軸を 右に40px, 下に30px移動
//			rect(0, 0, 30, 20);
//			popMatrix(); // 座標軸の位置をスタックから取り出すし設定する ... この場合(0, 0)
//			rect(0, 0, 30, 20);
//			pushMatrix(); // (0, 0)を原点とする座標軸をスタックに格納
//
//		}
		
		{
			rect(0, 0, 30, 20);
			translate(40, 30); // 座標軸を 右に40px, 下に30px移動
			rect(0, 0, 30, 20);
			translate(-10, 30); // 座標軸を 左に10px, 下に30px移動
			rect(0, 0, 30, 20);
		}


		int t = 250;
		if (doDrawAnimation) {
			pointCount = width - t;
			translate(t, height / 2);
		} else {
			pointCount = width;
			translate(0, height / 2);
		}

		// draw oscillator curve
		beginShape();
		for (int i = 0; i <= pointCount; i++) {
			angle = map(i, 0, pointCount, 0, TWO_PI);
			y = sin(angle * freq + radians(phi));
			y = y * 100;
			vertex(i, y);
		}
		endShape();

		if (doDrawAnimation) {
			drawAnimation();
		}

		if (savePDF) {
			savePDF = false;
			println("saving to pdf – finishing");
			endRecord();
		}
	}

	void drawAnimation() {
		// draw circle, dots and lines
		float t = ((float) frameCount / pointCount) % 1;
		angle = map(t, 0, 1, 0, TWO_PI);
		float x = cos(angle * freq + radians(phi));
		x = x * 100 - 125;
		y = sin(angle * freq + radians(phi));
		y = y * 100;
		// circle
		strokeWeight(1);
		ellipse(-125, 0, 200, 200);
		// lines
		stroke(0, 128);
		line(0, -100, 0, 100);
		line(0, 0, pointCount, 0);
		line(-225, 0, -25, 0);
		line(-125, -100, -125, 100);
		line(x, y, -125, 0);

		stroke(0, 130, 164);
		strokeWeight(2);
		line(t * pointCount, y, t * pointCount, 0);
		line(x, y, x, 0);

		float phiX = cos(radians(phi)) * 100 - 125;
		float phiY = sin(radians(phi)) * 100;
		// phi line
		strokeWeight(1);
		stroke(0, 128);
		line(-125, 0, phiX, phiY);
		// phi dots
		fill(0);
		stroke(255);
		strokeWeight(2);
		ellipse(0, phiY, 8, 8);
		ellipse(phiX, phiY, 8, 8);
		// dot on curve
		ellipse(t * pointCount, y, 10, 10);
		// dot on circle
		ellipse(x, y, 10, 10);
	}

	public void keyPressed() {
		if (key == 's' || key == 'S')
			saveFrame(timestamp() + ".png");
		if (key == 'p' || key == 'P') {
			savePDF = true;
			println("saving to pdf - starting");
		}

		if (key == 'a' || key == 'A')
			doDrawAnimation = !doDrawAnimation;

		if (key == '1')
			freq--;
		if (key == '2')
			freq++;
		freq = max(freq, 1);

		if (keyCode == LEFT)
			phi -= 15;
		if (keyCode == RIGHT)
			phi += 15;

		println("freq: " + freq + ", phi: " + phi);
	}

	String timestamp() {
		return String.format("%1$ty%1$tm%1$td_%1$tH%1$tM%1$tS", Calendar.getInstance());
	}

}
