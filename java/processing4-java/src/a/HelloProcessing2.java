package a;
import processing.core.PApplet;

public class HelloProcessing2 extends PApplet {
	public static void main(String args[]) {
		// --present 全画面表示
		
		PApplet.main(new String[] { "a.HelloProcessing2" });
		// PApplet.main(new String[] { "HelloProcessing" });
	}

	public void settings(){
        size( 800, 800 );     
    }
	public void setup() {
		// size(400, 400);
		background(0, 0, 0);
		smooth();
		strokeWeight(5);
	}

	public void draw() {
		noStroke();
		fill(0, 5);
		rect(0, 0, width, height);
		stroke(random(100, 255), random(100, 255), random(100, 255));
		if (mousePressed) {
			line(mouseX, mouseY, pmouseX, pmouseY);
			Circle circle = new Circle(this);
			circle.draw();
		}
	}
}

class Circle {
	PApplet parent;

	Circle(PApplet p) {
		parent = p;
	}

	void draw() {
		parent.fill(255, 50);
		parent.noStroke();
		float x = parent.random(0, parent.width);
		float y = parent.random(0, parent.height);
		float r = parent.random(1, 20);
		parent.ellipse(x, y, r, r);
	}
}
