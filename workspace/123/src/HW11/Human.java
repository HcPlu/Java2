package HW11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Human {
  private String firstName;
  private String lastName;
  private int height;
  private String birthday;
  private String occupation ="no-work-yet";
  private static Scanner input;
 public Human(){
	 input =new Scanner(System.in);
	 System.out.println("Please input the first name:");
	  firstName =input.next();
	 System.out.println("Please input the lastname: ");
	  lastName = input.next();
	 System.out.println("Please input height:");
	  height = input.nextInt();
	 System.out.println("Enter date of birth in DD/MM/Year:");
	  birthday = input.next();
 }
 public Human(int i){}
 public void setFirstName(String firstName){
	 this.firstName=firstName;
 }
 public String getFirstName(){
	 return firstName;
 }
 public void setLastName(String lastName){
	 this.lastName=lastName;
 }
 public String getLastName(){
	 return lastName;
 }
 public void setHeight(int height){
	 this.height=height; 
 }
 public int getHeight(){
	 return height;
 }
 public void setBirthday(String birthday){
	 this.birthday=birthday;
 }
 public String geBirthday(){
	 return birthday;
 }
 public void setOoccupationy(String occupation){
	 this.occupation=occupation;
	 
 }
 public String get0ccupation(){
	 return occupation;
 }

}


	
 
 
