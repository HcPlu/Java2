package HW8;

import java.util.Scanner;

public class EX_8_4 {
 public static void smoother(int[][] martrix)
 {
	 int[][] martrix2 = new int [3][3]; 
	 for(int i=0;i<3;i++){
		 for(int j=0;j<3;j++)
		 {
			 if(i==0){
				 if(j==0)martrix2[i][j]=(martrix[i][j]+martrix[i+1][j]+martrix[i][j+1]+martrix[i+1][j+1])/4;
				 else if(j==2) martrix2[i][j]=(martrix[i][j]+martrix[i][j-1]+martrix[i+1][j-1]+martrix[i+1][j])/4;
				 else martrix2[i][j]=(martrix[0][0]+martrix[1][0]+martrix[1][1]+martrix[0][1]+martrix[0][2]+martrix[1][2])/6;
			 }
			 if(i==1){
				 if(j==0)martrix2[i][j]=(martrix[0][0]+martrix[0][1]+martrix[i][j]+martrix[i+1][j]+martrix[i][j+1]+martrix[i+1][j+1])/6;
				 else if(j==2) martrix2[i][j]=(martrix[i][j]+martrix[i][j-1]+martrix[i+1][j-1]+martrix[i+1][j]+martrix[0][2]+martrix[0][1])/6;
				 else martrix2[i][j]=(martrix[0][0]+martrix[1][0]+martrix[1][1]+martrix[0][1]+martrix[0][2]+martrix[1][2]+martrix[2][0]+martrix[2][1]+martrix[2][2])/9;
				 
			 }
			 if(i==2){
				 if(j==0)martrix2[i][j]=(martrix[i][j]+martrix[i-1][j]+martrix[i][j+1]+martrix[i-1][j+1])/4;
				 else if(j==2) martrix2[i][j]=(martrix[i][j]+martrix[i][j-1]+martrix[i-1][j-1]+martrix[i-1][j])/4;
				 else martrix2[i][j]=(martrix[1][0]+martrix[2][0]+martrix[1][1]+martrix[2][1]+martrix[1][2]+martrix[2][2])/6;
		 }
	 }
 }
	 for(int i = 0;i<martrix2.length;i++)
	   {
		   for(int j=0;j<martrix2[i].length;j++)
		   {
			   System.out.printf("%4d",martrix2[i][j]);
		   }
		   System.out.println();
     }
 }
 public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   int [][] matrix =new int[3][3];
	   System.out.print("Enter a "+3+"*"+3+" matrix:");
	   for(int i = 0;i<matrix.length;i++)
	   {
		   for(int j=0;j<matrix[i].length;j++)
		   {
			   matrix [i][j]=input.nextInt();
		   }
    }
	 smoother(matrix);
 }
 
}
