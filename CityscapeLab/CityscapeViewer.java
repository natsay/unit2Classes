import javax.swing.JFrame;
import java.awt.Color; 
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;



/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @Natalie Tse
 * @10/12/15
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
    
        frame.setSize(2000, 600);

        frame.setSize(800 /* x */, 600 /* y */);

        frame.setTitle("Cityscape");
        Scanner s= new Scanner(System.in); 
        System.out.print("Enter for Morning(1) or Night(2): ");
        int time= s.nextInt(); 
        
       
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        CityscapeComponent component = new CityscapeComponent(time);
        frame.add(component);
        
        frame.setVisible(true);
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );

             
        }
        
    }
    

}

