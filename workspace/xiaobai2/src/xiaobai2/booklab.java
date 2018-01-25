package xiaobai2;

import java.util.Scanner;

public class booklab {

public static void main(String[] args) { 
Scanner scanner=new Scanner(System.in);
	System.out.println("请输入a");
double a=scanner.nextDouble(); 
System.out.println("请输入b");				
double b=scanner.nextDouble();
char oper='/';
switch(oper){
case'+':
System.out.println(a+"+"+b+"="+(a+b));
	break;
case'-':
System.out.println(a+"-"+b+"="+(a-b));
	break;
case'*':
System.out.println(a+"*"+b+"="+(a*b));
	break;
case'/':
System.out.println(a+"/"+b+"="+(a/b));
	break;
case'%':
System.out.println(a+"%"+b+"="+(a%b));
	break;
default:
	System.out.println("未知的操作！");
break;
   }		
System.out.println("到底="+3+5);
}



}


