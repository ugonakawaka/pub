package renshuu;

import java.util.stream.IntStream;

import processing.core.PApplet;
import renshuu.buhin.Shikaku;

public class Rensyuu002 extends PApplet {
	public static void main(String args[]) {

		PApplet.main(Rensyuu002.class, new String[] {});
	}

	public void settings() {
		size(800, 400);
	}


	public void setup() {
		
	}
	
	class Square {
		
		int wh;
		public Square(int wh) {
		this.wh = wh;
		}
		
		void draw() {
			strokeWeight(.75f);
			{ // 四角と円をかく
				line(0, 0, wh, 0);
				line(0, wh, wh, wh);
				line(wh, 0, wh, wh);
				line(0, 0, 0, wh);

				// stroke(1);
				// circle(this.centerPoint.x, this.centerPoint.y, this.diameter);

			}
		}
		
	}
	
	
	
	@Override
	public void draw() {
		background(255);
		Square square = new Square(30);
		square.draw();
		
		IntStream.range(1,20).forEach(i->{
			int x = i * 12;
			int y = i * 3;
			strokeWeight(mouseY/60*random(0.8f));
			translate(x, y);
			Shikaku shikaku = new Shikaku(30);
			shikaku.draw(getGraphics());
		});
		
		
	}
}
