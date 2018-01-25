package HW11;

import java.util.Scanner;
import  HW11.Polygon;
public class Square extends Polygon {
 private int lenght;
 private int height;
 public Square(){
	 super();
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the length and height for a square");
	 lenght = input.nextInt();
	 height = input.nextInt();
	    lenght = lenght>0?lenght:1;
	    height = height>0?height:1;
	    setlongth(lenght, height);
 }   
 public void setlongth(int lenght,int height){
	 this.lenght = lenght;
	 this.height = height;
 }
 public int getArea(){
	 return lenght*height;
 }
 public String toString(){
	 return "Square: "+super.toString()+ "the area is"+" the area is"+getArea();
 }
}
