import javax.swing.JOptionPane;

public class AreYoueHappy {
public static void main(String[] args) {

String answer=JOptionPane.showInputDialog("Are you happy ;)");
if(answer.equals("yes")) { 
	JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
}
else if(answer.equals("no")){
	JOptionPane.showInputDialog(null, "Do you want to be happy.");
	if(answer.equals("yes")){
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
	}
}
}
}

