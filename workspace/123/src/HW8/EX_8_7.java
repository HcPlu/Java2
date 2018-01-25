package HW8;

import java.util.Scanner;

public class EX_8_7 {
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
	  public static void throu(int [][] matrix,int m,int n)
	  
	  {
		  char D='R';
		  int  right=n-1,left=0,up=0,down=m-1;
		  int j=0;//ÐÐ
		  int k=0;//ÁÐ
		  int count=0;
		  
		  for(int i=0;i<m*n;i++)
		  {
			  System.out.printf("%4d",matrix[j][k]);
			  if(D=='R'){
			  if(k==right){
				  up++;
				  D='D';
				  j++;
			  }else k++;
			  
			  }else if(D=='D'){
				  if(j==down){
					  right--;
					  D='L';
					  k--;
				  }else j++;
				  
				  } else if(D=='L'){
					  if(k==left){
						  down--;
						  D='U';
						  j--;
					  }else k--;
					  
					  }else if(D=='U'){
						  if(j==up){
							  left++;
							  D='R';
							  k++;
						  }else j--;
						  
					  
				  }
		  }
		  
	  }
 public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   System.out.print("n: ");
	   int n =input.nextInt();
	   System.out.println("m: ");
	   int m= input.nextInt();
	   int [][] matrix =new int[m][n];
	   System.out.print("Enter a "+m+"*"+n+" matrix:");
	   for(int i = 0;i<matrix.length;i++)
	   {
		   for(int j=0;j<matrix[i].length;j++)
		   {
			   matrix [i][j]=input.nextInt();
		   }
       }
	   thall(matrix);
	   System.out.println("The spiral path is: ");
	   throu(matrix,m, n);
   }
}
