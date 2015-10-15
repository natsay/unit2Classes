import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 
import java.awt.Color;
/**
 * Write a description of class Doors here.
 * This class makes doors for every other building
 * @author Natalie Tse
 * @version 10/12/15
 */
public class Doors
{
    private int xLeft; 
    private int yTop; 

    public Doors(int x,int y)
    {
        xLeft=x;
        yTop=y;
    }

    
    public void draw(Graphics2D g2) 
    {
        Rectangle door1= new Rectangle(40,500,20,40);
        
        Rectangle door2= new Rectangle(260,500,20,40);
        
        Rectangle door3= new Rectangle(470,500,20,40);
        
        Rectangle door4= new Rectangle(680,500,20,40);
        
        
        
        
        g2.draw(door1);
        g2.setColor(new Color(224,255,255));
        g2.fill(door1); 
        
        g2.draw(door2);
        g2.setColor(new Color(255,192,203));
        g2.fill(door2);
        
        g2.draw(door3);
        g2.setColor(new Color(255,127,80));
        g2.fill(door3);
        
        g2.draw(door4);
        g2.setColor(new Color(221,160,221));
        g2.fill(door4);
    }
}
