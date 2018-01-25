package second_try;

import java.util.Scanner;

public class person
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[][] arrays1 = new int [3][3];
		  for(int i = 0;i<arrays1.length;i++)
		  {
			  for(int j=0;j<arrays1.length;j++)
			  {
				  System.out.println("ÇëÊäÈëa"+(i+1)+(j+1));
				   arrays1[i][j] = input.nextInt();
			  }
		  }
          for(int n = 0;n<arrays1.length;n++)
          {
        	  for(int m = 0;m<arrays1.length;m++)
        	  {
        		  System.out.printf("%2d",arrays1[n][m]);
        	  }
        	  System.out.printf("\n");
          }
	}
} 

