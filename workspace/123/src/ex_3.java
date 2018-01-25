
public class ex_3 {
  private static int a,e=0;
private static int b;
private static int c;
	public static void main(String[] args) {
    for(int i=100;i<=999;i++)
    {
       a=i%10;
       c=i/10;
       b=c%10;
       c/=10;
       
       if(a*a*a+b*b*b+c*c*c==i){
    	  System.out.print("\0"+i);
    	   e++;
       }
    }
    System.out.println("水仙话数总共有 "+e+" 个");
	}

}
