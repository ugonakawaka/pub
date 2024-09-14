package renshuu;

import processing.core.PApplet;

public class ReadSvg extends PApplet {

	public static void main(String[] args) {
		PApplet.main(ReadSvg.class, new String[] {});
	}

	public void settings() {
		size(800, 400);
	}

	public void setup() {

		var s = loadShape("svg/test/svg練習.svg");
		s.attribColor("box1", 123);
		s.translate(300, 3);
		s.getChild("box2").translate(-500, -100);
		s.getChild("box2").setFill(color(random(255)));
		shape(s);
	}

}
