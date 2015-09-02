
	/**
	 * This program displays a red cross on a white
	 * background.
	 */
 
	import java.awt.Graphics;
	import java.awt.Color;
	import java.awt.Container;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class RedCross extends JPanel
	{
	  public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);  // Call JPanel's paintComponent method
	                              //   to paint the background
	    int xCenter = getWidth() / 2;
	    int yCenter = getHeight() / 2;
	    g.setColor(Color.RED);
//	    g.fillRect(xCenter-5, yCenter, 10, 50);
//	    g.fillRect(xCenter-5, yCenter-50, 10, yCenter);
//	    g.fillRect(xCenter-50, yCenter-5, 50, 10);
//	    g.fillRect(xCenter, yCenter-5, 50, 10);

	    g.fillOval(xCenter-50, yCenter-50, 100, 100);
	    g.setColor(Color.WHITE);
	    g.fillOval(xCenter-25, yCenter-25, 50, 50);
	    g.setColor(Color.RED);
	    g.fillOval(xCenter-5, yCenter-5, 10, 10);
	  }

	  public static void main(String[] args)
	  {
	    JFrame window = new JFrame("Red Cross");
	    window.setBounds(300, 300, 200, 200);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    RedCross panel = new RedCross();
	    panel.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(panel);
	    window.setVisible(true);
	  }
	}
