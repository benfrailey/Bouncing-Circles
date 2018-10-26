import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BouncingCircles
{

	public static void main(String[] args)
	{
		JFrame theWindow = new JFrame();
		theWindow.setTitle("Bouncing Circles");
		theWindow.setSize(400, 400);
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CirclePanel thePanel = new CirclePanel(400, 400);
		
		Container thePane = theWindow.getContentPane();
		
		thePane.add(thePanel);
		
		theWindow.setVisible(true);
		
	}
	
}