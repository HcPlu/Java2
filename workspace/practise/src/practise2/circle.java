package practise2;

public class circle {
	public double x,y,r;
	public circle() {
		x=0;
		y=0;
		r=1;
	}
	public circle(double a,double b,double c) {
		x=a;
		y=b;
		r=c;
	}
	
	public double getArea() {
		return Math.PI*r*r;
	}
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
	public boolean contains(double a,double b) {
		return (Math.sqrt((x-a)*(x-a)+(y-b)*(y-b))<=r);
	}
	public boolean contains(double a,double b,double c) {
		return (Math.sqrt((x-a)*(x-a)+(y-b)*(y-b))>=(r-c));
	}
	public boolean overlap(double a,double b,double c) {
		return (Math.sqrt((x-a)*(x-a)+(y-b)*(y-b))<(r+c)&&(Math.sqrt((x-a)*(x-a)+(y-b)*(y-b))<=Math.abs(r-c)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle(2,2,5.5);
		System.out.printf("Circle1 area: %.3f\n",c1.getArea());
		System.out.printf("Circle1 premeter: %.3f\n",c1.getPerimeter());
		System.out.println("Does circle contains(3,3)? "+c1.contains(3, 3));
		System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? "+c1.contains(4, 5,10.5));
		System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? "+c1.overlap(3,5,2.3));
	}
}
