import java.util.Scanner; 

public class Pseudocode1
{
    public static void main(String[] args)
    { 
        Scanner s=new Scanner(System.in); 
        
        System.out.println("Enter a 10 digit number: "); 
        //(123)456-7890
        String number=s.next(); 
        String sub= number.substring(0,3);
        String sub2= number.substring(3,6);
        String sub3= number.substring(6,10);
        System.out.println("("+sub+")"+sub2+"-"+sub3); 
    }
}    
        