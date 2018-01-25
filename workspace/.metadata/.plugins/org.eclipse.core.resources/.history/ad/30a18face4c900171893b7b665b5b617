package HW7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex_3 {
	public static int k=0;
  public static void get(Integer[] intArray)
  {
	Arrays.sort(intArray);
	int [] array2 =new int [101];
	for(int i=0;i<intArray.length;i++)
	{
		array2[intArray[i]]++;
  }
	for(int i=1;i<101;i++)
	{
		if(array2[i]==0){
			i++;
		}else	System.out.println(i+" occurs "+array2[i]+" times");
	}
  }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
	   ArrayList<Integer> list1 = new ArrayList<Integer>();
	   System.out.println("Enter the integers between 1 and 100 :");
         int n =input.nextInt();
         int m;
         m =n;
         while(m!=0)
         {
        	 list1.add(m);
        	 m = input.nextInt();
         }
         Integer[] intArray = list1.toArray(new Integer[list1.size()]);
         get(intArray);
         
         
    }
}


