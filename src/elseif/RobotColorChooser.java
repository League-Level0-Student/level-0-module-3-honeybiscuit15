//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
Robot max = new Robot();
		//3. Ask the user what color they would like the robot to draw
for (int j = 0; j < 5.; j++) {

String color= JOptionPane.showInputDialog(null, "What color would you like");
		//4. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
	max.setPenColor(255, 0, 0);
}
	else if (color.equalsIgnoreCase("blue")) {
		max.setPenColor(0, 0, 255);	
}
	else if (color.equalsIgnoreCase("green")) {
		max.setPenColor(0, 128, 0);	
}
	else if (color.equalsIgnoreCase("yellow")) {
		max.setPenColor(255, 255, 0);	
}	
	
        //5. If the user doesn’t enter anything, choose a random color
		else {
			max.setRandomPenColor();	
}

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
for (int i = 0; i < 5.; i++) {
	max.setPenWidth(10);
	max.penDown();
	max.setSpeed(10);
	max.move(200);
	max.turn(90);
}
}
	}
}
	
