package HW7;

import java.util.Scanner;

public class Student {
    private String  name;
    private  int score;
      private Student(){
    	  this.name=name;
    	  this.score=score;
      }
      public static void main(String[] args){
      Scanner input = new Scanner (System.in);
	   System.out.println("ss");
	   int number = input.nextInt();
	   int[] list =new int[number];
	   String [] name1 =new String [number];
	   for(int i=0;i<list.length;i++)
	   {
		   System.out.println("Student "+(i+1)+" name and score:");
		   name1[i]=input.next();
		   list[i]=input.nextInt();
	   }
	   int exp =0;
	   String exp1=null;
	   for(int i=0;i<list.length;i++)
	   {
		   for(int j=0;j<list.length-1;j++)
		   {
			   if(list[j]<list[j+1]){
				   exp =list[j];
				   list[j]=list[j+1];
				   list[j+1]=exp;
				   exp1 =name1[j];
				   name1[j]=name1[j+1];
				   name1[j+1]=exp1;
			   }
				   
		   }
	   }
	   for(int i1=0;i1<list.length;i1++)
		   System.out.println(name1[i1]+"   "+list[i1]);
}
}