package HW8;

import java.util.Scanner;

public class EX_8_3 {
	public static int i,j,k=0,row,column;
   public static void  changer(int[][] stmatrix,int column)
   {
	   for(i = 0;i<stmatrix.length;i++)
	   {
		   k=0;
		   k +=i;
		   for(j=0;j<stmatrix[i].length;j++)
		   {
			   k++;
			   System.out.printf("%4d",stmatrix[i][j]);
			   if(k==column)
				   System.out.println();
		   }
	   }
   }
   public static void thall(int [][] stmatrix)
   {
	   System.out.println("The original matrix is:");
	   for(i = 0;i<stmatrix.length;i++)
	   {
		   for(j=0;j<stmatrix[i].length;j++)
		   {
			   System.out.printf("%4d",stmatrix[i][j]);
		   }
		   System.out.println();
       }
   }
   public static void main(String[] args)
   {
       int [][] stmatrix =new int[3][4];
	   Scanner input = new Scanner (System.in);
	   System.out.print("Enter a 3*4 matrix:");
	   for(i = 0;i<stmatrix.length;i++)
	   {
		   for(j=0;j<stmatrix[i].length;j++)
		   {
			   stmatrix [i][j]=input.nextInt();
		   }
       }
	   System.out.println("please enter the number of row and column of the new matrix.");
	   System.out.print("Row:");
	     row = input.nextInt();
	   System.out.print("Column:");
	     column = input.nextInt();
	   while(row*column!=12)
	   {
		   System.out.println("Please input two legal numbers r and c.");
		   System.out.print("Row:");
		    row = input.nextInt();
		   System.out.print("Column:");
		    column = input.nextInt();
	   }
	 changer(stmatrix,column);
   }
}
