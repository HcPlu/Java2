package xiaobai2;

import java.util.*;

public class shuzu {
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	         System.out.println("����Ҫ���뼸������");
	    int length=sc.nextInt();
		int [] shuzu=new int [length];
	     for(int i=0;i<length;i++){
		     System.out.println("����������");
		    shuzu [i]=sc.nextInt();	
	     }
	         Arrays.sort(shuzu);
	         System.out.println("���ֵ="+shuzu[length-1]+"��СֵΪ"+shuzu[0]);
  }
	
}
