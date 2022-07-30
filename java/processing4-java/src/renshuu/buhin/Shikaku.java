package renshuu.buhin;

import processing.core.PGraphics;
import processing.core.PShape;

public class Shikaku extends PShape {

	int wh;
	
	public Shikaku(int wh) {
		this.wh = wh;
	}
	
	@Override
	public void draw(PGraphics g) {
		
		g.line(0, 0, wh, 0);
		g.line(0, wh, wh, wh);
		g.line(wh, 0, wh, wh);
		g.line(0, 0, 0, wh);
		
	}
}
