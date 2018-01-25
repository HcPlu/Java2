import java.util.Scanner;

public class ex_4 {
	private int velocity;
	static double speed;
  public void ex_4(double a)
  {
	  speed = Math.pow((a/0.835),0.66666666666667);
  }
  public double getspeed(double a)
  {
	  return a;
  }
  public void Figue(int a)
  {
	  if(a<=2)
		  System.out.print("the wind with speed "+a+" is 'calm'");
	  else if(a>=70)
		  System.out.print("the wind with speed "+a+" is 'European windstorm'");
	  else 
		  System.out.print("the wind with speed "+a+" is 'normal'");
  }
  public void find(double a)
  {
	  if(a-(int)a>=0.5)
		  System.out.print(" , its scale is "+(int)a+1);
	  else System.out.print(" , its scale is "+(int)a);
  }
	public static void main(String[] args) {
		ex_4 lala = new ex_4();
		System.out.println("Enter wind speed:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		lala.Figue(a);
		lala.ex_4(a);
		lala.find(speed);
        
	}

}
