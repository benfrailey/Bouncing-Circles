


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class My711Frailey
{

	public static void main(String[] args)
	{
		JFrame theWindow = new JFrame();
		theWindow.setTitle("My Program");
		theWindow.setSize(400, 400);
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		My711Panel thePanel = new My711Panel(400, 400);
		
		Container thePane = theWindow.getContentPane();
		
		thePane.add(thePanel);
		
		theWindow.setVisible(true);
		
	}
	
}