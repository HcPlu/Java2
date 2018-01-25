import java.util.Scanner;

public class ex_2 {

	public static double[] qwe;
	public static Scanner input;

	public static void main(String[] args) {
		double m,d;
		int i;
		qwe = new double[6]; 
		input = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		for(i=1;i<=5;i++) qwe[i]=input.nextDouble();
		m=0;
		d=0;
		for(i=1;i<=5;i++) {
			m+=Double.valueOf(qwe[i]);
			d+=Double.valueOf(qwe[i])*Double.valueOf(qwe[i]);
		}
		d=Math.sqrt((d-m*m/5)/4);
		m=m/5;
		System.out.println("The mean is "+m);
		System.out.println("The standard deviation is "+d);
}
}