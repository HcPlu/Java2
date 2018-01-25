package HW8;

import java.util.Scanner;

public class EX_8_6 {
  public static void thall(int[][] matrix,int n)
  {
	  System.out.println("The matrix after clockwise rotate is: ");
	  for(int i=0;i<matrix.length;i++)
	  {
		  for(int j=n-1;j>=0;j--)
		  {
			  System.out.printf("%4d",matrix[j][i]);
		  }System.out.println();
	  }
  }
  public static void thall(int [][] stmatrix)
  {
	   System.out.println("The original matrix is:");
	   for(int i = 0;i<stmatrix.length;i++)
	   {
		   for(int j=0;j<stmatrix[i].length;j++)
		   {
			   System.out.printf("%4d",stmatrix[i][j]);
		   }
		   System.out.println();
	  }
  }
  public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   System.out.print("n: ");
	   int n =input.nextInt();
	   int [][] matrix =new int[n][n];
	   System.out.print("Enter a "+n+"*"+n+" matrix:");
	   for(int i = 0;i<matrix.length;i++)
	   {
		   for(int j=0;j<matrix[i].length;j++)
		   {
			   matrix [i][j]=input.nextInt();
		   }
      }
	   thall(matrix);
	   thall(matrix, n);
  }
}
