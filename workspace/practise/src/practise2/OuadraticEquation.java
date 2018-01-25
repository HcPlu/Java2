package practise2;
import java.util.*;
public class OuadraticEquation {
 private static double a,b,c;
 private static Scanner input;
  public static double iGeta(double a)
  {
	  return a;
  }
  public static double iGetb(double b)
  {
	  return b;
  }
  public static double iGetc(double c)
  {
	  return c;
  }
  public static double getDiscriminant(double a,double b ,double c)
  {
	  return b*b-4*a*c;
  }
   public static double getRoot1(double b,double d,double a)
   {
	   return (-b+Math.pow(d, 0.5))/(2*a);
   }
   public static double getRoot2(double b,double d,double a)
   {
	   return -(b+Math.pow(d, 0.5))/(2*a);
   }
     public static void main (String[] args)
     {
    	 System.out.println("Enter a,b,c");
    	 input = new Scanner(System.in);
    	double a=input.nextDouble();
    	double b=input.nextDouble();
    	double c=input.nextDouble();
    	OuadraticEquation.iGeta(a);
    	OuadraticEquation.iGetb(b);
    	OuadraticEquation.iGetc(c);
    	 double d = OuadraticEquation.getDiscriminant(OuadraticEquation.iGeta(a), OuadraticEquation.iGetb(b), OuadraticEquation.iGetc(c));
    	 if(OuadraticEquation.getDiscriminant(a, b, c)>=0&&OuadraticEquation.getRoot1(b,d,a)!=OuadraticEquation.getRoot2(b,d,a))
    	 {
    		 System.out.println("The equation has two roots  "+OuadraticEquation.getRoot1(b,d,a)+" and "+OuadraticEquation.getRoot2(b,d,a));
    	 }else if (OuadraticEquation.getDiscriminant(a, b, c)>=0&&OuadraticEquation.getRoot1(b,d,a)==OuadraticEquation.getRoot2(b,d,a)){
    		 System.out.println("The equation has one roots  "+OuadraticEquation.getRoot1(b,d,a));
    	 }else
    		 System.out.println("The equation has no roots.");
    		 
     }
}

