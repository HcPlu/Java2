import java.util.*;
public class Mytriangle {
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter three sides for a triangle");
	  int a = input.nextInt();
	  int b = input.nextInt();
	  int c = input.nextInt();
	 Mytriangle.isValid(a, b, c);
	 if(Mytriangle.isValid(a, b, c))
		 Mytriangle.area(a, b, c);
		 else
			 System.out.println("Input is invalid");
 }
public	static	boolean	isValid(double	side1,	double	side2,	double	side3)
   {
	
	if(side1+side2>side3&&side2+side3>side1&&side1+side3>side2)
	return true;
	else return false;
   }
public	static	double	area(double	side1,	double	side2,	double	side3){
                double area;
                area = Math.pow((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side1+side3-side2), 0.5)*0.25;
                System.out.println("The area of the triangle is"+area);
                return area;
}
}