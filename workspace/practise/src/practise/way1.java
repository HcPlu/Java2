package practise;

import java.util.Scanner;

public class way1 {
    private static int age;
    private static String name;
    private static Scanner input;
    
   private void eat()
   {
	   System.out.println(age+"��"+"��"+name+"ϲ���Խ���");
   }
   
   private  int age1(int age)
   {
	   return age;
   }
   
   private String name(String name)
   {
	   return name;
   }

  public static void main (String[] args)
  {
	  way1 p = new way1();
	  input = new Scanner(System.in);
	  age = input.nextInt();
	   p.age1(age);
	  name = input.nextLine();
	   p.name(name);
	  p.eat();
  }
}
