package HW7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex_4 {
	private static int random = (int) (Math.random()*53+1);
	private static int i,j=0;
	private static Scanner input = new Scanner (System.in);
   public static  int getRandom(int left,int right,int [] numbers){
	   Random random = new Random();
	   int ran = 0;
	   int k=0;
	   ArrayList<Integer> list1= new ArrayList<Integer>(); 
	   for(int i=0;i<numbers.length;i++)
	   {
		   list1.add(numbers[i]);
	   }
	   while(k!=right)
	   {
		   ran = random.nextInt(right)%(right-left+1)+left;
		   if(!list1.contains(ran))
		   {
			   System.out.println(ran);
			   k++;
		   }
		   
	   }
	return 0;
   }
   public static boolean judge(double random,int...numbers)
   {
	   for(i=0;i<numbers.length;i++)
	   {
		   if(random==numbers[i])
			   j++;
	   }
	   if(j!=0)
		   return false;
	   return true;
   }
    public static void main(String [] args){
    	System.out.println("Please input the range(left and right)");
    	int left =input.nextInt();
    	int right = input.nextInt();
    	System.out.println("Please input the length of the array");
        int length=input.nextInt();
        int [] array =new int[length];
        System.out.println("Enter"+length+"number");
        for(int i=0;i<array.length;i++)
        {
        	array[i]=input.nextInt();
        }
		getRandom(left, right, array);
	}
}