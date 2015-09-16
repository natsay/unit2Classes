

/**
 * It is class that exhibts properties for a door
 * 
 * @Natalie Tse
 * @9/15/15 
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name; 
    private String state; 

    /**
     * Default constructor for objects of class Door
     */
    public Door(String name,String State)
    {
        this.name=name ; 
        this.state=state;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
 
     * @post    state of door object will now be set to open
     *          (what the method guarantees upon completion)
   
     */
    public void open()
    {
        this.state="open";
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     
     * @post   state of door object will now be closed 
     */
    public void closed()
    {
        this.state="closed"; 
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
    
     * @post    this will return the name of the dooor 
     *      
     */
    public String getName()
    {
        return this.name; 
    }
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     
     * @post   setting the name of the door to a new name 
     *          
     */
    public void setName(String newName) 
    {
        this.name =newName; 
    }
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * 
     * @post    will return the state of the door 
     *          
     */
    public String getState()
    {
        return this.state;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     
     * @post    will be able to set a new state to the door fgdf
     * 
     */
    public void setState(String newState)
    {
        this.state= newState; 
    }
    
}