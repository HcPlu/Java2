package HW8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EX_8_5 {
	public static int k;
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.print("The height of triangle (the first dimesion of the jagged array): ");
	  int height = input.nextInt();
	  int[][] triangle = new int [height][];
	  System.out.println("Please input the triangle data into the jagged array");
	  for(int i = 0;i<height;i++)
	  {
		  System.out.print("the"+i+"row of the triangle: ");
		  triangle[i] = new int[i+1];
		  for(int j=0;j<i+1;j++)
		  {
			  triangle[i][j]=input.nextInt();
		  }
	  }
	  thall(triangle);
	  findmin(triangle);

    }
	public static void thall(int[][] triangle)
	{
		System.out.println("The triangle:");
		  for(int i = 0;i<triangle.length;i++)
		   {
			   for(int j=0;j<triangle[i].length;j++)
			   {
				   System.out.printf("%4d",triangle[i][j]);
			   }
			   System.out.println();
	}
  }
	public static void findmin(int[][] triangle)
	{
		System.out.println("The minumum path:");
		for(int i=0;i<triangle.length;i++)
		{
			Arrays.sort(triangle[i]);
			System.out.printf("%4d",triangle[i][0]);
		}
	}
}

