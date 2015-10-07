import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 
import java.awt.Color;
/**
 * Write a description of class Buildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Windows
{
    private int xLeft; 
    private int yTop; 

    
    public Windows(int x,int y)
    {
        xLeft=x;
        yTop=y;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle wind1= new Rectangle(10,300,20,20);
        Rectangle wind2= new Rectangle(40,300,20,20);
      
        
        
        g2.draw(wind1);
        g2.setColor(Color.WHITE); 
        g2.fill(wind1);
        
        g2.draw(wind2);
        g2.setColor(Color.WHITE); 
        g2.fill(wind2);
        
        
        
        
        
        
    }
}