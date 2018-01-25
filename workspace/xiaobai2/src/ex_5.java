import java.util.*;
public class ex_5 {
  public static void main(String[] args){
    int i,d,j;
   Scanner input = new Scanner(System.in);
   int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
   String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
   System.out.println("Enter year");
      int year = input.nextInt();
   System.out.println("Enter day");
      int day = input.nextInt();
      for(j=0;j<12;j++) {
			System.out.printf("                  %s %d\n",months[j],year);
			System.out.println("---------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			for(i=0;i<day;i++)  System.out.printf("   \t");
			for(i=1;i<=days[j];i++) {
				if(((i+day-1)%7)==0&&i!=1)
					System.out.println();
				System.out.printf("%2d \t",i);
		    }
			System.out.println();
			System.out.println();
			day=(days[j]+day)%7;
		}

  }
}