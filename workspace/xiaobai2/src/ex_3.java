import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex_3{
public static void main(String[] args) {
	int i,n,m;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter numbers:");
	i=1;
	m=input.nextInt();
	n=m;
	while(n!=0) {
		System.out.println(n);
		n=input.nextInt();
		if(n==m)
			i++;
		else if(n>m) {
			i=1;
			m=n;
		}
	}
	
	System.out.println("The largest number is "+m);
	System.out.println("The occurance count of the largest number is "+i);
}
}