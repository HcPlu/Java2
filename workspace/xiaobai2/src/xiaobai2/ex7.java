package xiaobai2;
import java.util.Scanner;
public class ex7 {
	public static int i,j,k;
	public static void main(String[] args) {
	    int[][] arrays1={{1,2,3},{1,2,3},{1,2,3}};
	for(int i=0;i<arrays1.length;i++)
	{
		for(int j=0;j<arrays1.length;j++){
			System.out.print(" "+arrays1[i][j]);
		}System.out.printf("\n");
		
	}for (i = 1; i <= 5; i++)
	{
		 for (j = 1; j <= 3; j++)
		 {
		 for (k = 1; k <= 4; k++)
		 System.out.print('*');
		 System.out.println();
		 } // end inner for
		 System.out.println();
		} // end outer for
	}
}