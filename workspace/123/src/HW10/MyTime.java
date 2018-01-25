package HW10;

import java.util.Calendar;
import java.util.Scanner;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class MyTime {
	private   int hour;
	private  int minute;
	private  int second;
    public  MyTime(int hour,int minute,int second){
    	this.hour = hour;
    	this.minute = minute;
    	this.second = second;
    }
    public void inputTime(int hour,int minute,int second){
    	
    }
    public int getHour(){
    	return hour;
    }
    public int getMinute(){
    	return minute;
    }
    public int getSecond(){
    	return second;
    }
    @Override
    public String toString(){
		return" "+hour+ " : "+ minute+" : "+second;
    	
    }
    public int timeDifference(){
    	return hour*3600+minute*60+second;
    
    	
    }
    public static int getDhour(int hour1,int hour2){
    	int hour =Math.abs(hour1-hour2);
    	return hour/3600;
    	
    }
    public static int getDminute(int hour1,int hour2){
    	int hour =Math.abs(hour1-hour2);
    	return (hour%3600)/60;
    	
    }
    public static int getDsecond(int hour1,int hour2){
    	int hour =Math.abs(hour1-hour2);
    	return (hour%3600)%60;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar currentTime1 = Calendar.getInstance();
		int h=currentTime1.get(Calendar.HOUR_OF_DAY);
		int m=currentTime1.get(Calendar.MINUTE);
		int s=currentTime1.get(Calendar.MINUTE);
		Scanner input=new Scanner(System.in);
		MyTime currentTime =new MyTime(h,m,s);
		System.out.println("current time"+currentTime.toString());
		System.out.print("input time: ");
		MyTime time1=new MyTime(input.nextInt(),input.nextInt(),input.nextInt());
		if(time1.hour>23||time1.hour<0||time1.minute<0||time1.minute>59||time1.second<0||time1.second>59){
			System.out.println("please input legal number");
		}
         System.out.println("input time"+time1.toString());
         MyTime time2 = new MyTime(getDhour(currentTime.timeDifference(), time1.timeDifference()), getDminute(currentTime.timeDifference(),time1.timeDifference()), getDsecond(currentTime.timeDifference(), time1.timeDifference()));
	     System.out.println("difference: "+time2.toString());
	}


}
