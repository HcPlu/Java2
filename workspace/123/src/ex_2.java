import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		System.out.println("product number:");
		Scanner input= new Scanner(System.in);
		int a,c=0,i=0,d,e=1;
		double b = 0;
		double [] price = {2.98,2.50,9.98,4.49,6.87};
    	a=input.nextInt();
    	c=a;
        while(c>0&&a>0)
        {
        	c=input.nextInt();
        	if(c<0)
        		break;
        	
        	b +=price[a-1]*c;
        	a=input.nextInt();
        	
        }
        
        System.out.println("total price:"+b);
	}

}
