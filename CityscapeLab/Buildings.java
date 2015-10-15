


import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 
import java.awt.Color;
/**
 * Write a description of class Buildings here.
 * This class makes buldings by drawing rectangles and then filling them in with black
 * @Natalie Tse
 * @10/12/15
 */
public class Buildings
{
    private int xLeft; 
    private int yTop; 

    
    public Buildings(int x,int y)
    {
        xLeft=x;
        yTop=y;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle build1= new Rectangle(5,200,100,404);
        Rectangle build2= new Rectangle(110,300,100,330);
        Rectangle build3= new Rectangle(215,110,100,500);
        Rectangle build4= new Rectangle(320,100,100,500);
        Rectangle build5= new Rectangle(425,150,100,500);
        Rectangle build6= new Rectangle(530,200,100,500);
        Rectangle build7= new Rectangle(635,100,100,500);
        
        
        g2.draw(build1);
        g2.setColor(Color.BLACK); 
        g2.fill(build1);
        
        g2.draw(build2);
        g2.setColor(Color.BLACK); 
        g2.fill(build2);
        
        g2.draw(build3);
        g2.setColor(Color.BLACK); 
        g2.fill(build3);
        
        g2.draw(build4);
        g2.setColor(Color.BLACK); 
        g2.fill(build4);
        
        g2.draw(build5);
        g2.setColor(Color.BLACK); 
        g2.fill(build5);
        
        g2.draw(build6);
        g2.setColor(Color.BLACK); 
        g2.fill(build6);
        
        g2.draw(build7);
        g2.setColor(Color.BLACK); 
        g2.fill(build7);
       
        
        
        
        
    }
}
