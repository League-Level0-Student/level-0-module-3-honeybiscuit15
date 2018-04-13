package extras;

import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {		
	static Robot kev = new Robot();

	public static void main(String[] args) {
		kev.setPenWidth(10);
			kev.penDown();
			kev.setSpeed(100);
			String answer = JOptionPane.showInputDialog("What shape would you like");
						String color = JOptionPane.showInputDialog("Which color would you like");
if (answer.equalsIgnoreCase("square")) {
			drawSquare();
			}else if(answer.equalsIgnoreCase("triangle")) {
				drawTriangle();
			}else if(answer.equalsIgnoreCase("circle")){
				drawCircle();
			}else {
		JOptionPane.showMessageDialog(null, "Sorry, i don't remember that shape");
	}			

			if (color.equalsIgnoreCase("red")) {
				kev.setPenColor(255, 0, 0);
			}
				else if (color.equalsIgnoreCase("blue")) {
					kev.setPenColor(0, 0, 255);	
			}
				else if (color.equalsIgnoreCase("green")) {
					kev.setPenColor(0, 128, 0);	
			}
				else if (color.equalsIgnoreCase("yellow")) {
					kev.setPenColor(255, 255, 0);	
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, i don't remember that shape");
			}				
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
		kev.turn(1);
		}	
}

