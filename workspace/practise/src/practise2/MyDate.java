package practise2;
import java.util.*;
public class MyDate {

		public int month,day,year;
		public MyDate() {
			GregorianCalendar n = new GregorianCalendar();
			month=n.get(GregorianCalendar.MONTH);
			day=n.get(GregorianCalendar.DAY_OF_MONTH);
			year=n.get(GregorianCalendar.YEAR);
		}
		public MyDate(long t){
			GregorianCalendar n = new GregorianCalendar();
			n.setTimeInMillis(t);
			month=n.get(GregorianCalendar.MONTH);
			day=n.get(GregorianCalendar.DAY_OF_MONTH);
			year=n.get(GregorianCalendar.YEAR);
		}
		public MyDate(int y,int m,int d) {
			year=y;
			month=m;
			day=d;
		}
		public int gy() {return year;}
		public int gm() {return month+1;}
		public int gd() {return day;}
		public void setDate(long d) {
			GregorianCalendar n = new GregorianCalendar();
			n.setTimeInMillis(d);
			month=n.get(GregorianCalendar.MONTH);
			day=n.get(GregorianCalendar.DAY_OF_MONTH);
			year=n.get(GregorianCalendar.YEAR);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyDate d1=new MyDate();
			MyDate d2=new MyDate(34355555133101L);
			System.out.println("Date1: "+d1.gm()+"/"+d1.gd()+"/"+d1.gy());
			System.out.println("Date2: "+d2.gm()+"/"+d2.gd()+"/"+d2.gy());
		}

	}
