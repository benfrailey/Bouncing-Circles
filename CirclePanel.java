

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CirclePanel extends JPanel
{

	private Circles myCircle, myCircle2;
	private javax.swing.Timer timer;
	boolean mousePressed = false;
	
	public CirclePanel(int width, int height)
	{
		setBackground(Color.cyan); // you could have the client pass in the color when the panel is constructed
		setPreferredSize(new Dimension(width, height)); // size is expressed in terms of an anonymous Dimension object
		
		myCircle = new Circles(50, 50, 20, Color.green);
		
		myCircle2 = new Circles(350, 350, 20, Color.blue);
		
		myCircle.setSpeed(5);
		
		myCircle2.setSpeed(5);
		
		timer = new javax.swing.Timer(33, new MoveListener());
		
		timer.start();
	}
	
	public void paintComponent(Graphics g)
	{
	
		super.paintComponent(g);
		myCircle.fill(g);
		myCircle2.fill(g);
	}
	
	private class MoveListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent e)
		{
				//int x = myCircle.getX();
				//int radius = myCircle.getRadius();
				
				myCircle.move();
				myCircle2.move();
				myCircle.turn(2);
				myCircle2.turn(2);
				if(myCircle.getX() - myCircle.getRadius() <= 0 || myCircle.getX() + myCircle.getRadius() >= getWidth())
					myCircle.setSpeed(myCircle.getSpeed() * -1);
				
				if(myCircle2.getX() - myCircle2.getRadius() <= 0 || myCircle2.getX() + myCircle2.getRadius() >= getWidth())
					myCircle2.setSpeed(myCircle2.getSpeed() * -1);
					
				if(myCircle.getY() - myCircle.getRadius() <= 0 || myCircle.getY() + myCircle.getRadius() >= getHeight())
					myCircle.setSpeed(myCircle.getSpeed() * -1);
				
				if(myCircle2.getY() - myCircle2.getRadius() <= 0 || myCircle2.getY() + myCircle2.getRadius() >= getHeight())
					myCircle2.setSpeed(myCircle2.getSpeed() * -1);
				repaint(); // this is how we call the paintComponent method
		}
	}
}