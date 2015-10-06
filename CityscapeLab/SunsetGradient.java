import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class SunsetGradient extends JPanel
{
  public void paint(Graphics g) 
  {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;

    GradientPaint gp1 = new GradientPaint(100,0, Color.blue, 100, 600, Color.orange, true);

    g2d.setPaint(gp1);
    g2d.fillRect(0,0,2000,600);

  }
}
    