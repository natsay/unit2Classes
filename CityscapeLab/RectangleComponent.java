import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Rectangle; 
import javax.swing.JComponent; 

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleComponent extends JComponent
{
    public void paintComponet(Graphics g) 
    {
        Graphics2D g2=(Graphics2D) g; 
        Rectangle box =new Rectangle(5,10,20,20); 
        g2.draw(box); 
        box.translate(15,25); 
        g2.draw(box); 
    }
}    
