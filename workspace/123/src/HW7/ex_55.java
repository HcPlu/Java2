package HW7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex_55 {

	public static  void main(String[] args) {
		   Scanner input = new Scanner (System.in);
		   int[] list =new int[10];
		   for(int i=0;i<list.length;i++)
		   {
			   list[i]=input.nextInt();
		   }
		   ArrayList<Integer> list1 = new ArrayList<Integer>();
		   for(int i =0;i<list.length;i++)
		   {
			   if(!list1.contains(list[i]))
			   {
				   list1.add(list[i]);
			   }
		   }
		 for(int k=0;k<list1.size();k++)
		 {
			 System.out.println(list1.get(k));
		 }
	}

}
