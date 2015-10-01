import java.util.Scanner; 

public class Pseudocode2
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the amount due"); 
        int due=s.nextInt(); 
        System.out.println("Enter the amont received"); 
        int received=s.nextInt(); 
        int change= received-due; 
        int quarters= change/25; 
        int dimes= quarters/10; 
        int nickels= dimes/5; 
        int pennies= nickels/1;
        
        System.out.println("Quarters: "+quarters); 
        
        
        
    }
}    
        