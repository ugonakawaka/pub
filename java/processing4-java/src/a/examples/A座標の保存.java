package a.examples;

import processing.core.PApplet;

// 参考
// https://r-dimension.xsrv.jp/classes_j/3_interactive3d/
public class A座標の保存 extends PApplet {
	public static void main(String args[]) {

		PApplet.main(A座標の保存.class, new String[] {});
	}

	public void settings() {
		size(400, 400, P3D);
	}

	float boxSize = 20;
	float distance = 30;
	float halfDis;
	int boxNum = 6;

	public void setup() {

		halfDis = distance * (boxNum - 1) / 2;
	}

	public void draw() {
		background(0);
//	  smooth();
//	  noStroke();
		stroke(255, 0, 0, 100);

		{ // 十字のライン
			line(width / 2, 0, width / 2, height);
			line(0, height / 2, width, height / 2);
		}
		translate(width / 2, height / 2);
		rotateY(radians(mouseX));
		rotateX(radians(mouseY));

		stroke(0);
		fill(255, 255, 255);

		for (int z = 0; z < boxNum; z++) {
			for (int y = 0; y < boxNum; y++) {
				for (int x = 0; x < boxNum; x++) {
					//
					pushMatrix();
					translate(x * distance - halfDis, y * distance - halfDis, z * distance - halfDis);
					box(boxSize, boxSize, boxSize);
					popMatrix();
				}
			}
		}
	}
}
