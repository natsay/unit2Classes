import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        

        SunsetGradient sunset= new SunsetGradient();
        sunset.paint(g2);
        
        Moon moon= new Moon(0,0); 
        moon.draw(g2);
        
        Buildings build1= new Buildings(0,0);
        build1.draw(g2);
        
        Buildings build2= new Buildings(0,0);
        build2.draw(g2);
        
        Buildings build3= new Buildings(0,0);
        build3.draw(g2);
        
        Buildings build4= new Buildings(0,0);
        build4.draw(g2);
        
        Buildings build5= new Buildings(0,0);
        build5.draw(g2);
        
        Windows wind1= new Windows(0,0); 
        wind1.draw(g2); 
        
        Windows wind2= new Windows(0,0); 
        wind1.draw(g2); 
        
        Windows wind3= new Windows(0,0); 
        wind1.draw(g2); 
        
        
        
        
        
        

        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
