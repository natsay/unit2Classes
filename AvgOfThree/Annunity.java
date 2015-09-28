public class Annunity
{
   public static void main(String[] args)
   {
     int PMT=10000;
     double n= 20.0;
     double i= .08; 
     
     double PVann= PMT*(((Math.pow((1+i),(n-1))-1)/i)/(Math.pow((1+i),(n-1))+1)); 
     
     System.out.println(PVann);
     
     
       
   }
}