
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot max = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
max.setX(100);
max.setSpeed(500);
max.penDown();
max.setRandomPenColor();
max.hide();
for (int j = 0; j < 15; j++) {
// 2. Make the robot draw a star shape. Hint: 144.
for (int i = 0; i < 6; i++) {
max.move(30);
max.turn(144);	
}
max.penUp();
max.setAngle(90);
max.move(50);
max.penDown();
}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
