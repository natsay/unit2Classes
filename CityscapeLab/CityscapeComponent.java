import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @Natalie Tse
 * @v10/12/15
 */
public class CityscapeComponent extends JComponent
{
    private Car car1;
    private int animation;
    private int time;
    
    final int TIME_DAY=1;  
    final int TIME_NIGHT=2; 
    public CityscapeComponent(int _time) 
    {
        time=_time;
    }   
        
    
   
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
      
        

        SunsetGradient sunset= new SunsetGradient(time);
        sunset.paint(g2);
        
        
        
        
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
        
        Buildings build6= new Buildings(0,0);
        build6.draw(g2);
        
        Buildings build7= new Buildings(0,0);
        build7.draw(g2);
        
        
        
        Windows wind1= new Windows(0,0); 
        wind1.draw(g2); 
        
        Windows wind2= new Windows(0,0); 
        wind2.draw(g2); 
        
        Windows wind3= new Windows(0,0); 
        wind3.draw(g2); 
        
        Windows wind4= new Windows(0,0); 
        wind4.draw(g2); 
        
        Windows wind5= new Windows(0,0); 
        wind5.draw(g2); 
        
        Windows wind6= new Windows(0,0); 
        wind6.draw(g2);
        
        Windows wind7= new Windows(0,0); 
        wind7.draw(g2);
        
        Windows wind8= new Windows(0,0); 
        wind7.draw(g2);
        
        Doors door1= new Doors(0,0); 
        door1.draw(g2);
        
        //Building 2
        Windows wind9= new Windows(0,0); 
        wind9.draw(g2);
        
        Windows wind10= new Windows(0,0); 
        wind10.draw(g2);
        
        Windows wind11= new Windows(0,0); 
        wind11.draw(g2);
        
        Windows wind12= new Windows(0,0); 
        wind12.draw(g2);
        
        
        Windows wind13= new Windows(0,0); 
        wind13.draw(g2);
        
        Windows wind14= new Windows(0,0); 
        wind14.draw(g2);
        
        Windows wind15= new Windows(0,0); 
        wind15.draw(g2);
        
        Windows wind16= new Windows(0,0); 
        wind16.draw(g2);
         
        Windows wind17= new Windows(0,0); 
        wind17.draw(g2);
        
        Windows wind18= new Windows(0,0); 
        wind18.draw(g2);
         
        Windows wind19= new Windows(0,0); 
        wind19.draw(g2);
        
        Windows wind20= new Windows(0,0); 
        wind20.draw(g2);

        Doors door2= new Doors(0,0); 
        door1.draw(g2);
        
        //Building 6
        
        Windows wind21= new Windows(0,0); 
        wind21.draw(g2);
        
        Windows wind22= new Windows(0,0); 
        wind22.draw(g2);
        
        Windows wind23= new Windows(0,0); 
        wind23.draw(g2);
        
        Windows wind24= new Windows(0,0); 
        wind24.draw(g2);
        
        Windows wind25= new Windows(0,0); 
        wind25.draw(g2);
        
        Windows wind26= new Windows(0,0); 
        wind26.draw(g2);
        
        Windows wind27= new Windows(0,0); 
        wind27.draw(g2);
        
        Windows wind28= new Windows(0,0); 
        wind28.draw(g2);
        
        Windows wind29= new Windows(0,0); 
        wind20.draw(g2);
        
        Windows wind30= new Windows(0,0); 
        wind30.draw(g2);
        
        Doors door3= new Doors(0,0); 
        door3.draw(g2);
        
        
        //Building 8
        Windows wind31= new Windows(0,0); 
        wind31.draw(g2);
        
        Windows wind32= new Windows(0,0); 
        wind32.draw(g2);
        
                
        Windows wind33= new Windows(0,0); 
        wind33.draw(g2);
        
        Windows wind34= new Windows(0,0); 
        wind34.draw(g2);
        
        Windows wind35= new Windows(0,0); 
        wind35.draw(g2);
        
        Windows wind36= new Windows(0,0); 
        wind36.draw(g2);
        
        Windows wind37= new Windows(0,0); 
        wind37.draw(g2);
        
        Windows wind38= new Windows(0,0); 
        wind38.draw(g2);
        
        Windows wind39= new Windows(0,0); 
        wind39.draw(g2);
        
        Windows wind40= new Windows(0,0); 
        wind40.draw(g2);
        
        Windows wind41= new Windows(0,0); 
        wind41.draw(g2);
        
        Windows wind42= new Windows(0,0); 
        wind42.draw(g2);
        
        
        Doors door4= new Doors(0,0); 
        door4.draw(g2);
      
        
        this.car1.draw(g2); 
        
  

        
        
    }
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        
        this.animation += 5;
        this.car1 = new Car(5 + animation,510);
        
        repaint();
    }
    
}    