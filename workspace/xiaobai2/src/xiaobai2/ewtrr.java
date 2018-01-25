package xiaobai2;

import java.util.*;

public class ewtrr {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("string1");
      String string1=input.next();
      int num=0;
      char[] ch=string1.toCharArray();
      for(int i = 0;i<string1.length();i++)
      {
    	if(ch[i]>='0'&&ch[i]<='9')
    	{
    	   num++;	
    	}
      }System.out.println(num);

	}

}
