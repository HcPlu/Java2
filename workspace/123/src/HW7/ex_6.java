package HW7;

import java.util.Scanner;

public class ex_6 {
  public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   System.out.println("ss");
	   int number = input.nextInt();
	   int[] list =new int[number];
	   String [] name =new String [number];
	   for(int i=0;i<list.length;i++)
	   {
		   name[i]=input.next();
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
				   exp1 =name[j];
				   name[j]=name[j+1];
				   name[j+1]=exp1;
			   }
				   
		   }
	   }
	   for(int i1=0;i1<list.length;i1++)
		   System.out.println(name[i1]+list[i1]);
  }
}