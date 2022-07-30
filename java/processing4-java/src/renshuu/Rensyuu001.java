package renshuu;

import processing.core.PApplet;

public class Rensyuu001 extends PApplet {
	public static void main(String args[]) {

		PApplet.main(Rensyuu001.class, new String[] {});
	}

	public void settings() {
		size(800, 400);
	}

	public void setup() {

		this.circle = new Circle(width * 0.25f);

	}

	@Override
	public void draw() {

		background(255);
		Action action = () -> {
			this.circle.draw();
		};

		translate(400, 100, action).apply();
		;

	}

	record CenterPoint(int x, int y) {
	}

	// ==================================
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

	// ==================================
	class Circle {
		float wh = 0;
		int diameter = 0;
		float radius = 0;
		float freq = 1f;
		// 中心点
		CenterPoint centerPoint;

		Circle(float wh) {
			final float ratio = 0.85f;

			this.wh = wh;
			this.diameter = (int) (wh * ratio);
			this.radius = this.diameter / 2;
			this.centerPoint = new CenterPoint((int) (this.wh / 2), (int) (this.wh / 2));
		}

	
		float angle;
		float x, y;

		void calc() {
			float t = ((float) frameCount / ((int)diameter)) % 1;
			this.angle = map(t, 0, 1, 0, TWO_PI);
			this.x = cos(angle * freq);
			this.x = this.x * this.radius * -1;// 逆時計回り
			this.y = sin(angle * freq);
			this.y = this.y * this.radius;
		}

		void draw() {
			calc();
			stroke(0);
			strokeWeight(.75f);
			{ // 四角と円をかく
				line(0, 0, wh, 0);
				line(0, wh, wh, wh);
				line(wh, 0, wh, wh);
				line(0, 0, 0, wh);

				// stroke(1);
				circle(this.centerPoint.x, this.centerPoint.y, this.diameter);

			}
			{
				// 十字
				line(this.centerPoint.x, 0, this.centerPoint.x, wh);
				line(0, this.centerPoint.y, wh, this.centerPoint.y);
			}
			{ // 四角上にドットを描く
				float a = ((int) (wh * 0.15)) / 2;
				// a = 0;
				line(x + this.centerPoint.x, 0, x + this.centerPoint.x, y + this.centerPoint.y);
				line(0, y + this.radius + a, x + this.centerPoint.x, y + this.centerPoint.y);
				ellipse(0, y + this.radius + a, 10, 10);
				ellipse(x + this.radius + a, 0, 10, 10);
			}

			{ // 円上で動くドットを描く
				pushMatrix();
				// draw circle, dots and lines
				translate(this.centerPoint.x, this.centerPoint.y);
				// dot on circle
				ellipse(x, y, 10, 10);
				popMatrix();
			}

		}

	}

	// ==================================
	// ここでサイズを決めたら

	Circle circle;

}
