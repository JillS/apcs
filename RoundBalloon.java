
import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{   
private int xCenter;
private int yCenter;
private int radius;
private Color color;
	
  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public RoundBalloon()
  {
	  super();  // this is optional: default
	  System.out.println("Spot #2");
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public RoundBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
    System.out.println("Spot #3");
  }
	  
  public void draw(Graphics g, boolean makeItFilled)
  {
	//super.draw(g, makeItFilled); 
	  System.out.println("Spot #12");
    g.setColor(color);
    g.fillOval(100, 100, 20, 20);
    if (makeItFilled)
      g.fillOval(xCenter - radius,
                 yCenter - radius, 2*radius, 2*radius);
    else
      g.drawOval(xCenter - radius,
                 yCenter - radius, 2*radius, 2*radius);
  }
}
