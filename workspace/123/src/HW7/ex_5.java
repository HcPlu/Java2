package HW7;

import java.util.Arrays;
import java.util.Scanner;

public class ex_5 {
   public static void eliminateDuplicates(int[] list)
   {
	   for(int i = 0;i<list.length-1;i++)
	   {
		   for(int j=i+1;j<list.length-1;j++)
		   {
			   if(list[i]==list[j])
			   {
				   for(int k=i;k<list.length-1;k++)
				   {
					   list[i]=list[i+1];
				   }
			   }
		   }
	}

	   }
   public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   int[] list =new int[10];
	   for(int i=0;i<list.length;i++)
	   {
		   list[i]=input.nextInt();
	   }
	   eliminateDuplicates(list);
	   for(int i=0;i<list.length;i++)
	   {
		   System.out.println(list[i]);
	   }
	   input.close();
   }
   
}
