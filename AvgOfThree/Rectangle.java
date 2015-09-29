import java.util.Scanner; 

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in); 
        double a,b,c,d; 
        System.out.print("Please input your Rectangle's first length: "); 
        a=s.nextDouble(); 
        System.out.print("Please input your Rectangle's second length: "); 
        b= s.nextDouble(); 
        System.out.print("Please input your Rectangle's first width: "); 
        c= s.nextDouble(); 
        System.out.print("Please input your Rectangle's second width: "); 
        d=s.nextDouble();
        double perimeter=(a+b+c+d); 
        double area=(a*c);
        System.out.println("Perimeter: " + perimeter); 
        System.out.println("Area: "+ area);
    }
}    