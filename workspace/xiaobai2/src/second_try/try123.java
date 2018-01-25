package second_try;

import java.util.Scanner;

public  class try123{ 
		public static void main(String[] args) {
			long a;
			int[] b=new int[100];
			int i;
			Scanner input=new Scanner(System.in);
			System.out.println("The input number: ");
			a=input.nextLong();
			i=1;
			while(a>0) {
				b[i]=(int) (a&15);
				a=a>>4;
				i++;
			}
			for(i--;i>0;i--) {
				switch(b[i]) {
				case 10: System.out.print("a");
				break;
				case 11: System.out.print("b");
				break;
				case 12: System.out.print("c");
				break;
				case 13: System.out.print("d");
				break;
				case 14: System.out.print("e");
				break;
				case 15: System.out.print("d");
				break;
				default:
				System.out.print(b[i]);
				break;
				}
				
			}
		}

	}
