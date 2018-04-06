package extras;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {		
	static Robot kev = new Robot();

	public static void main(String[] args) {
		kev.setPenWidth(10);
			kev.penDown();
			kev.setSpeed(10);
			drawSquare();
		drawTriangle();
		drawCircle();
	}

	static void drawSquare() {
		
		for (int j = 0; j < 5.; j++) {
			
			kev.move(200);
			kev.turn(90);
		}
	
	}
	static void drawTriangle() {
		for(int i = 0; i<4.; i++) {
			
			kev.move(200);
			kev.turn(120);

		
		}
	}
	static void drawCircle() {
			kev.
		}	
}
