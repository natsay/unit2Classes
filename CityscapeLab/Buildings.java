
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
        Rectangle build2= new Rectangle(110,300,100,404);
        Rectangle build3= new Rectangle(215,110,100,500);
        Rectangle build4= new Rectangle(320,100,100,500);
        Rectangle build5= new Rectangle(425,150,100,500);
        Rectangle build6= new Rectangle(530,200,100,500);
        Rectangle build7= new Rectangle(635,100,100,500);
        Rectangle build8= new Rectangle(740,190,100,500);
        Rectangle build9= new Rectangle(845,200,100,500);
        Rectangle build10= new Rectangle(950,70,100,500);
        Rectangle build11= new Rectangle(1055,356,100,500);
        Rectangle build12= new Rectangle(1160,144,100,500);
        Rectangle build13= new Rectangle(1265,421,100,500);
        Rectangle build14= new Rectangle(1370,299,100,500);
        Rectangle build15= new Rectangle(1475,71,100,500);
        Rectangle build16= new Rectangle(1580,380,100,500);
        
        
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
       
        g2.draw(build8);
        g2.setColor(Color.BLACK); 
        g2.fill(build8);
        
        g2.draw(build9);
        g2.setColor(Color.BLACK); 
        g2.fill(build9);
        
        
        g2.draw(build10);
        g2.setColor(Color.BLACK); 
        g2.fill(build10);
       
        g2.draw(build11);
        g2.setColor(Color.BLACK); 
        g2.fill(build11);
        
        g2.draw(build12);
        g2.setColor(Color.BLACK); 
        g2.fill(build12);
        
        g2.draw(build13);
        g2.setColor(Color.BLACK); 
        g2.fill(build13);
        
        g2.draw(build14);
        g2.setColor(Color.BLACK); 
        g2.fill(build14);
        
        g2.draw(build15);
        g2.setColor(Color.BLACK); 
        g2.fill(build15);
        
        g2.draw(build16);
        g2.setColor(Color.BLACK); 
        g2.fill(build16);
        
        
        
        
    }
}

