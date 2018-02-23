//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(99)+1; 		
			
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
				for (int i = 0; i < 9; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String answer = JOptionPane.showInputDialog("Guess the number I'm thinking of?");

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int number= Integer.parseInt(answer);

		// 5. if the guess is correct
				// 6. Win
				// 11. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
if (number==random){
	JOptionPane.showMessageDialog(null, "Winner");
	System.exit(0);
} else if(number>random){
	JOptionPane.showMessageDialog(null,"too high" );
} else if(number<random){
	JOptionPane.showMessageDialog(null,"too low");
} 
	
		// 12. Tell them they lose
		
	}
JOptionPane.showMessageDialog(null, "You lose");

	}
}


