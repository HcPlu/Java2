package practise;

public class fan {
	final int slow=1,medium=2,fast=3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public fan(int a) {
		speed=a;
	}
	public fan() {
		speed=slow;
		on=false;
		radius=5;
		color="blue";
	}
	public fan(int s,boolean o,double r,String c) {
		cspd(s);
		con(o);
		cr(r);
		cc(c);
	}
	
	public int rspd() {return speed;}
	public boolean ron() {return on;}
	public double rr() {return radius;}
	public String rc() {return color;}
	
	public void cspd(int s) {speed=s;}
	public void con(boolean o) {on=o;}
	public void cr(double r) {radius=r;}
	public void cc(String c) {color=c;}
	
	public String ss(int p) {
		if (p==1) return "SLOW";
		else if(p==2) return "MEDIUM";
		else return "FAST";
	}
	
	public String toString() {
		if(on) {
			return("Fan speed: "+ ss(rspd()) + ",color: " + String.valueOf(rc()) + ",radius: " + String.valueOf(rr()));
		}
		else {
			return("Fan color: " + String.valueOf(rc()) + ",radius: " + String.valueOf(rr())+".Fan is off.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan f2=new fan();
		fan f1=new fan(3,true,10,"yellow");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}

