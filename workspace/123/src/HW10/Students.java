package HW10;

public class Students {
	private String name;
	private int score;
	private String studentNumber;
	static int count=0;
	
	public Students(String tname){
		this.score=(int) (Math.random()*100);
		this.name=tname;
		count++;
		this.studentNumber="stu"+count;
	}
	
	public Students(){
		this.score=(int) Math.random();
		this.name="UnKnown";
		count++;
		this.studentNumber="stu"+count;
	}
	
	public String toString() {
		return(this.studentNumber+" [name="+this.name+", score="+this.score+"]");
	}
	public int GetScore() {
		return(this.score);
	}
}
