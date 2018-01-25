package HW11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class  Saler extends Human{
		  private String company;
		  private int salary;
		  private String dateOfHire;
		 public Saler(){
                   super.setOoccupationy("Saler");
                   Scanner input = new Scanner(System.in);
			  System.out.println("Please input the company:");
			  company = input.next();
			  System.out.println("Enter salary");
			  salary = input.nextInt();
			  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			  dateOfHire = df.format(new Date());
		 }
		 @Override
		 public String toString(){
			 return super.getFirstName()+" "+super.getLastName()+" "+"is "+super.getHeight()+" born on "+super.geBirthday()+" work as "+super.get0ccupation()+" in "+company+" salary as "+salary+" hired on "+dateOfHire;
			 
	 }
}
