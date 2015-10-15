import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D;
import java.awt.geom.Point2D; 
import java.awt.Color;
/**
 * Write a description of class Buildings here.
 * This class makes windows by drawing squares and then filling them in with different colors
 * @author Natalie Tse
 * @10/12/15
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
        Rectangle wind1= new Rectangle(10,300,40,40);
        Rectangle wind2= new Rectangle(60,300,40,40);
        Rectangle wind3= new Rectangle(10,360,40,40);
        Rectangle wind4= new Rectangle(60,360,40,40);
        Rectangle wind5= new Rectangle(10,420,40,40);
        Rectangle wind6= new Rectangle(60,420,40,40);
        Rectangle wind7= new Rectangle(10,240,40,40);
        Rectangle wind8= new Rectangle(60,240,40,40);
        
        //Building3
        
        Rectangle wind9= new Rectangle(220,310,40,40);
        Rectangle wind10= new Rectangle(270,310,40,40);
        
        Rectangle wind11= new Rectangle(220,360,40,40);
        Rectangle wind12= new Rectangle(270,360,40,40);
        
        Rectangle wind13= new Rectangle(220,410,40,40);
        Rectangle wind14= new Rectangle(270,410,40,40);
        
        Rectangle wind15= new Rectangle(220,260,40,40);
        Rectangle wind16= new Rectangle(270,260,40,40);
        
        Rectangle wind17= new Rectangle(220,210,40,40);
        Rectangle wind18= new Rectangle(270,210,40,40);
        
        Rectangle wind19= new Rectangle(220,160,40,40);
        Rectangle wind20= new Rectangle(270,160,40,40);

        
        //Building 6
        Rectangle wind21= new Rectangle(430,410,40,40);
        Rectangle wind22= new Rectangle(480,410,40,40);
        
        Rectangle wind23= new Rectangle(430,360,40,40);
        Rectangle wind24= new Rectangle(480,360,40,40);
        
        Rectangle wind25= new Rectangle(430,310,40,40);
        Rectangle wind26= new Rectangle(480,310,40,40);
        
        Rectangle wind27= new Rectangle(430,260,40,40);
        Rectangle wind28= new Rectangle(480,260,40,40);
        
        Rectangle wind29= new Rectangle(430,210,40,40);
        Rectangle wind30= new Rectangle(480,210,40,40);
        
        //Buiding 8 
        
        Rectangle wind31= new Rectangle(640,210,40,40);
        Rectangle wind32= new Rectangle(690,210,40,40);
        
        Rectangle wind33= new Rectangle(640,260,40,40);
        Rectangle wind34= new Rectangle(690,260,40,40);
        
        Rectangle wind35= new Rectangle(640,310,40,40);
        Rectangle wind36= new Rectangle(690,310,40,40);
        
        Rectangle wind37= new Rectangle(640,360,40,40);
        Rectangle wind38= new Rectangle(690,360,40,40);
        
        Rectangle wind39= new Rectangle(640,410,40,40);
        Rectangle wind40= new Rectangle(690,410,40,40);
        
        Rectangle wind41= new Rectangle(640,160,40,40);
        Rectangle wind42= new Rectangle(690,160,40,40);

        
        
        
        
        
        
        
        
      
        
        
        g2.draw(wind1);
        g2.setColor(new Color(175,238,238)); 
        g2.fill(wind1);

        g2.draw(wind2);
        g2.setColor(new Color(175,238,238)); 
        g2.fill(wind2);
        
        g2.draw(wind3);
        g2.setColor(new Color(175,238,238));
        g2.fill(wind3);
      
        g2.draw(wind4);
        g2.setColor(new Color(175,238,238));
        g2.fill(wind4);
        
        g2.draw(wind5);
        g2.setColor(new Color(175,238,238));
        g2.fill(wind5);
        
        g2.draw(wind6);
        g2.setColor(new Color(175,238,238)); 
        g2.fill(wind6);
        
        g2.draw(wind7);
        g2.setColor(new Color(175,238,238));
        g2.fill(wind7);
        
        g2.draw(wind8);
        g2.setColor(new Color(175,238,238)); 
        g2.fill(wind8);
        
        //Building 3
        
        g2.draw(wind9);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind9);

        g2.draw(wind10);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind10);
        
        g2.draw(wind11);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind11);
        
        g2.draw(wind12);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind12);
        
        g2.draw(wind13);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind13);
        
        g2.draw(wind14);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind14);
        
        g2.draw(wind15);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind15);
        
        g2.draw(wind16);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind16);
        
        g2.draw(wind17);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind17);
        
        g2.draw(wind18);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind18);
        
        g2.draw(wind19);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind19);
        
        g2.draw(wind20);
        g2.setColor(new Color(255,192,203));
        g2.fill(wind20);
        
        //Building6
       
        g2.draw(wind21);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind21);
        
        g2.draw(wind22);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind22);
        
        g2.draw(wind23);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind23);
        
        g2.draw(wind24);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind24);
        
        g2.draw(wind25);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind25);
        
        g2.draw(wind26);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind26);
        
        g2.draw(wind27);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind27);
        
        g2.draw(wind28);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind28);
        
        g2.draw(wind29);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind29);
        
        g2.draw(wind30);
        g2.setColor(new Color(255,127,80));
        g2.fill(wind30);
        
        g2.draw(wind31);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind31);
        
        g2.draw(wind32);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind32);
        
        
        g2.draw(wind33);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind33);
        
        g2.draw(wind34);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind34);
        
        g2.draw(wind35);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind35);
        
        g2.draw(wind36);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind36);
        
        g2.draw(wind37);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind37);
        
        g2.draw(wind38);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind38);
        
        g2.draw(wind39);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind39);
        
        g2.draw(wind40);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind40);
        
        g2.draw(wind41);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind41);
        
        g2.draw(wind42);
        g2.setColor(new Color(221,160,221));
        g2.fill(wind42);


        
        
        


        
        
    }
}