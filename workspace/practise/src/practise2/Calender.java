package practise2;
import java.util.*;
public  class Calender {
  public static void main(String[] args){
	GregorianCalendar cal = new GregorianCalendar();
	   int year = cal.get(GregorianCalendar.YEAR);
	   int month = cal.get(GregorianCalendar.MONTH);
	       month+= 1;
	   int day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	System.out.println("Current year,month,and day in fomat Mth/Day/Year:"+day+"/"+month+"/"+year);
	
    GregorianCalendar cal2 = new GregorianCalendar();
      cal2.setTimeInMillis(1234567898765L);
      int year1 = cal2.get(GregorianCalendar.YEAR);
      int month2 = cal.get(GregorianCalendar.MONTH);
  int day2 = cal.get(GregorianCalendar.DAY_OF_MONTH);
       month2 += 1;
  System.out.println("Elapsed time since January 1,1970 set to 1234567898765L Mth/Day/Year:"+day2+"/"+month2+"/"+year1);
}
}