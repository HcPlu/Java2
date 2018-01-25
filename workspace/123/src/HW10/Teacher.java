package HW10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import HW7.Student;

/*   private String name;
   private static int a=0 ,b,c,d,f;
   private ArrayList<student> students = new ArrayList<>();
   private ArrayList<String>  Teachers = new ArrayList<>();
   public Teacher(){
	   this.name=name;
	   this.students = students;
   }
   public void addStudent(String name){
   }
   public void printStudents(ArrayList<student> students,String str){
	   int[] list1 = new int[students.size()];
    for(student sud:students){
    	a=a+1;
    	System.out.println(sud.getStudentNumber()+" name= "+sud.getName()+" Score=  "+sud.getScore()+" teacher= "+str);
    }
    }

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Teacher Evan1 = new Teacher();
	    Teacher Alice1 = new Teacher();
	    int i=0;
	    String Str= "Evan";
	    String Str1 = "Alice";
	    String fan="Y";
	    String fan1="Y";
	    Random ran = new Random();
		   int score=ran.nextInt(100)*101;
	    do{System.out.println("Please input teacher's name:");
	    String TeaName = input.next();
	       if(TeaName.equals("Evan")){
	        System.out.println("Please input student's name");
	        i++;
	        score=ran.nextInt(100)%101;
	        Evan1.students.add(new student(input.next(),score,"Str"+i));//输入学生
	    do{
	        System.out.println("Continue to add student for teacher"+Str+"Y/N");
	         fan=input.next();
	    if(fan.equals("Y")){
	    	  System.out.println("Please input student's name");
	    	  i++;
	    	  score=ran.nextInt(100)%101;
	  	    Evan1.students.add(new student(input.next(),score,"Str"+i));
	  	  System.out.println("Continue to add student for teacher"+Str);//输入学生
	  	   fan=input.next();
	    }
	      }while(fan.equals("Y"));
	       }else if(TeaName.equals("Alice"))
	    {
	        System.out.println("Please input student's name");
	        i++;
	        score=ran.nextInt(100)%101;
	        Alice1.students.add(new student(input.next(),score,"Str"+i));//输入学生
	    do{
	       System.out.println("Continue to add student for teacher"+Str1);
	       fan1=input.next();
	       if(fan1.equals("Y")){
	    	   System.out.println("Please input student's name");
	    	   i++;
	    	   score=ran.nextInt(100)%101;
	  	     Alice1.students.add(new student(input.next(),score,"Str"+i));//输入学生
	  	   System.out.println("Continue to add student for teacher"+Str1);
	  	    fan1=input.next();
	    }
	       }while(fan1.equals("Y"));
	    
	     }
	        }while(fan.equals("Y")||fan1.equals("Y"));
	    Evan1.printStudents(Evan1.students,Str);
	    Alice1.printStudents(Alice1.students,Str1); 
	    for(int j = 0;j<list.length;j++){
	    	b+=list[j];
	    }
	    b=b/list.length;
	    c=list[0];
          System.out.println("average score"+b);
          for(int k=1;k<list.length;k++){
        	  if(c<list[k])
        		  c=list[k];
          }
          System.out.println(c);
	
	}
}
class student {
	   private String name;
	   private int score;
	   private String studentNumber;
	   private static int count=0;
	   public int student(){
		   Random ran = new Random();
		   return ran.nextInt(100)*101;
	   }
	   public static Iterator Interator() {
		// TODO Auto-generated method stub
		return null;
	}
	public student(String name,int score,String studentNumber){
		   this.name = name;
		   this.score = score;
		   this.studentNumber = studentNumber;
	   }

	   public String getName(){
		   return name;
	   }
	   public int getScore(){
		   return score;
	   }
	   public String getStudentNumber(){
		   return studentNumber;
	   }
	   public int getCount(){
		   return count;
	   }
	 //   public String toString(){
		//   return "Stu"
	 //  }
}
	*/
	
	public class Teacher {
		private String name;
		private ArrayList<Students> students = new ArrayList<>();
		private int n;
		
		public Teacher(String tname) {
			this.name=tname;
			this.n=0;
		}
		
		public int addStudent(String tname) {
			Students t=new Students(tname);
			students.add(t);
			return(t.GetScore());
		}
		public void printAllStudents() {
			for(int i=0;i<students.size();i++) System.out.println(students.get(i).toString());
			
		}
		public String GetName() {
			return(this.name);
		}
		public static void main(String[] args) {
			int n=0,max=-1,t;
			double tot=0;
			String s;
			Teacher[] a=new Teacher[100];
			Scanner in=new Scanner(System.in);
			while(true) {
				System.out.println("Please input a teacher's name:");
				a[++n] =new Teacher(in.nextLine());
				while(true) {
					System.out.println("Please input a student's name:");
					t=a[n].addStudent(in.nextLine());
					if(t>max)max=t;
					tot+=t;
					System.out.println("Continue to add student?Y/N");
					if(in.nextLine().equals("N"))
						break;
				}
				System.out.println("Continue to add teacher?Y/N");
				if(in.nextLine().equals("N"))
					break;
			}
			for(t=1;t<=n;t++) {
				System.out.println("Students of teacher "+a[t].GetName());
				a[t].printAllStudents();
				System.out.println();
			}
			System.out.printf("The average score for all students is %.3f\n",tot/Students.count);
			System.out.println("The largest score for all students is "+max);
		}
	}
	
