import java.util.*;
public class ex_1 {

	public static void main(String[] args) {
	  Scanner input =  new Scanner(System.in);
	  System.out.println("Enter an interger");
	    int Number1 = input.nextInt();
	    int a,b,i=2;
	    System.out.printf("The smallest factors :");
    
	    do
	    {   
	    	if(Number1%i==0){
	    		Number1=Number1/i;
	    		System.out.printf("%3d",i);
	    	}else{
	    		i++;
	    	}
	    }while(Number1!=1);
	  
	}

}
