import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon
{   
private int xCenter;
private int yCenter;
private int radius;
private Color color;


	public OvalBalloon()
	{}
	
	public OvalBalloon(int x, int y, int r, Color c)
	{  super(x, y, r, c);  }
	
	public void draw(Graphics g, boolean makeItFilled)
	  {

		  System.out.println("Spot #oval");
	    g.setColor(color);
	    g.fillOval(100, 100, 20, 20);
	    if (makeItFilled)
	      g.fillOval(xCenter - radius,
	                 yCenter - radius, 4*radius, 2*radius);
	    else
	      g.drawOval(xCenter - radius,
	                 yCenter - radius, 4*radius, 2*radius);
	  }
}
