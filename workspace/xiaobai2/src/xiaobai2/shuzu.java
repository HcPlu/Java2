package xiaobai2;

import java.util.*;

public class shuzu {
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	         System.out.println("请问要输入几个数字");
	    int length=sc.nextInt();
		int [] shuzu=new int [length];
	     for(int i=0;i<length;i++){
		     System.out.println("请输入数字");
		    shuzu [i]=sc.nextInt();	
	     }
	         Arrays.sort(shuzu);
	         System.out.println("最大值="+shuzu[length-1]+"最小值为"+shuzu[0]);
  }
	
}
