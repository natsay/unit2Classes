

/**
 * a vending machine that holds cans of soda. To buy a can of soda, the customer needs to insert a token into the machine. When the token is inserted, a can drops from the can reservoir into the product delivery slot. The vending machine can be filled with more cans. 
 * The goal is to determine how many cans and tokens are in the machine at any given time.
 * 
 * @author Natalie Tse  
 * @version 9/21/15 
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans; 
    private int tokens; 

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans, int tokens )
    {
        this.cans=10;
        this.tokens=0; 
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int newCans)
    {
       cans+=newCans 
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void insertToken(int newTokens) 
    {
        tokens+=newTokens 
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokens() 
    {
        return tokens  
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getCans() 
    {
        return cans 
    }

}
