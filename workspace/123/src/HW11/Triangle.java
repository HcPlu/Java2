package HW11;

import java.util.Scanner;

public class Triangle extends Polygon{
private double side1;
private double side2;
private double side3;
public Triangle(){
	super();
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please input the three sides for a triangle");
	 side1 = input.nextDouble();
	 side2 = input.nextDouble();
	 side3 = input.nextDouble();
	    side1 = side1>0?side1:1;
	    side2 = side2>0?side2:1;
	    side3 = side3>0?side3:1;
	   if(side1+side2<=side3||side1-side2>=side3)
		   side1=side2=side3=1;
	   setSide(side1, side2, side3);
	  
}

public void setSide(double side1,double side2,double side3){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}
public double getArea(){
	return (Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side1+side3-side2)*(side2+side3-side1))/4);
}
public String toString(){
	return "Triangle :"+super.toString()+" the area is "+getArea();
}
}
