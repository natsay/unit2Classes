import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class SunsetGradient 
{
  final int TIME_DAY=1;  
  final int TIME_NIGHT=2;
  private int time;
  public SunsetGradient(int _time)
  {
      time=_time;
      
  }   
  
  
  public void paint(Graphics g) 
  {
    GradientPaint gp1;
    
    if( time==TIME_DAY)
    {
        
        Graphics2D g2d = (Graphics2D) g;

        gp1 = new GradientPaint(100,0, new Color(0,0,128), 100, 600, new Color(255,140,0), true);

        g2d.setPaint(gp1);
        g2d.fillRect(0,0,2000,600);
    }   
    
    else
    {
    
        
    
        Graphics2D g2d = (Graphics2D) g;

        gp1 = new GradientPaint(100,0, new Color(176,224,230), 100, 600, new Color(255,140,0), true);

        g2d.setPaint(gp1);
        g2d.fillRect(0,0,2000,600);
    }   
    
    

    
    //This method helps create a sunset gradient by combining to colors 

  }
}