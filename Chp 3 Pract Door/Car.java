

/**
 * A car has a certain fuel efficinency and a certain amount of fuel in the gas tank. 
 * The car may be driven which reduces the amount of gas in the fuel tank.
 * @author (Natalie Tse) 
 * @version (9/10/15)
 */
public class Car
{
    /** the fuel efficiency for the car measured in units of miles/gallon(mpg) */
    private double fuelEfficiency;
    /** the amount of fuel in the tank of the car measure in units of gallons*/
    private double fuelInTank;
    
    /**
     * Constructor for objects of class Car that specifies the fuel efficiency 
     */
    public Car(double fuelEfficiency)
    {
        this.fuelEfficiency= fuelEfficiency;
        this.fuelInTank = 0;
        // "this.=self in python
    }

    /**
     * Increments the amount of gas in the car's tank by the specified number of gallons. 
     *
     * @pre       gallonsofGas must be positive 
     * @param    gallonsofGas amount of gas to add the car's tank 
     
     */
    public void addGas(double gallonsOfGas)
    {
       fuelInTank += gallonsOfGas; 
    }
        

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre    reutrns the number of gallons of gas in the car's tank
     *
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank; 
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
    public void drive(double distance)
    {
       fuelInTank -= distance/fuelEfficiency;
    }

}


