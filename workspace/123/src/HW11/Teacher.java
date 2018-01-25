package HW11;

import java.util.Scanner;

public class Teacher extends Human{
			private String university;
			private int salary;
			private String major;
			public Teacher(){
				super.setOoccupationy("Teacher");
				Scanner input = new Scanner(System.in);
			  System.out.println("Enter university");
				university = input.next();
			  System.out.println("Enter major");
			   major = input.next();
			  System.out.println("Enter salary");
			   salary = input.nextInt();
			}
			@Override
			public String toString(){
				return super.getFirstName()+" "+super.getLastName()+" "+"is "+super.getHeight()+" born on "+super.geBirthday()+" work as "+super.get0ccupation()+" in "+university+" major in "+major+" salary as "+salary;
		}
}
