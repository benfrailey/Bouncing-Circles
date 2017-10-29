import java.awt.*;


public class My711Circle
{

	private int centerX, centerY, radius, speed, direction;
	private Color theColor;
	
	public My711Circle(int x, int y, int r, Color c)
	{
	
		centerX = x;
		centerY = y;
		radius = r;
		theColor = c;
	}
	
	public void draw(Graphics g)
	{
	
		Color oldColor = g.getColor();
		g.setColor(theColor);
		g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
		g.setColor(oldColor);
	}
	
	public void fill(Graphics g)
	{
	
		Color oldColor = g.getColor();
		g.setColor(theColor);
		g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
		g.setColor(oldColor);
	}
	
	public boolean containsPoint(int x, int y)
	{
	
		double xSquared = Math.pow(x - centerX, 2);
		double ySquared = Math.pow(y - centerY, 2);
		double radiusSquared = Math.pow(radius, 2);
		return xSquared + ySquared - radiusSquared <= 0;
	}
	
	
	public void move(int xAmount, int yAmount)
	{
	
		centerX = centerX + xAmount;
		centerY = centerY + yAmount;
	}
	
	public void move()
	{
	
		int horizontalComponent;
		int verticalComponent;
		horizontalComponent = (int)(speed * Math.cos(Math.toRadians(direction)));
		verticalComponent = (int)(speed * Math.sin(Math.toRadians(direction)));
		move(horizontalComponent, verticalComponent);
	/*	if(centerX > My711Panel.width - radius || centerY > My711Panel.height - radius)
			speed = -speed;*/
	}
	
	public void setDirection(int degrees)
	{
		direction = degrees % 360;
	
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public int getX()
	{
		return centerX;
	}
	
	public int getY()
	{
		return centerY;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void turn(int degrees)
	{
		direction = (direction + degrees) % 360;
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	