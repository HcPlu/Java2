import java.util.Scanner;

public class ex_1 {
;
private  int x = input.nextInt();
  private  int [] pieces = {x,12,24,8,22,15,4,8,6,x};
  private static Scanner input= new Scanner(System.in);
  private int a,b,i=1;
  private static int j=0;
    public  void ex_1()
    {
    	for(int i = 0;i<pieces.length;i++)
    	{
    		if(pieces[i]%2!=0)
    			pieces[i] -= 1;
    		
    		a = pieces[i];
    		pieces[i] = b+pieces[i]/2;
    		b = a/2;
    	}
          }
    public boolean zxc()
    {	;
	if(pieces[1]==pieces[2]&&pieces[2]==pieces[3]&&pieces[3]==pieces[4]&&pieces[4]==pieces[5]&&pieces[5]==pieces[6]&&pieces[6]==pieces[7]&&pieces[7]==pieces[8]&&pieces[8]==pieces[9])
       return false;
	else return true;

    }
    
    public static void main(String[] args) {
        System.out.println("Enter number");
    	 ex_1 n = new ex_1();
        do{
        j++;
        	n.ex_1();
        	
        }while(n.zxc());
        
        System.out.println("After looping "+j+" times,each kid get "+n.pieces[3]+" chocolates");
  
}
}