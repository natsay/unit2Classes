import java.util.Scanner; 

public class StringParsing
{
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in); 
        
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        String number=s.next() ;
        number=number.replace(",",""); 
        System.out.println(number); 
        
        
        
        
    }
}    
        