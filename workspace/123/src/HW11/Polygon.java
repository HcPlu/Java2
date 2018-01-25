package HW11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

enum Color{Yellow("Yellow"),Red("Yellow"),White("White"),Black("Black"),Green("Green");
	private Color(String color){
		this.color = color;
	}
	private String color;
	public String getColor(){
		return color;
	}
	}
public class Polygon {
 private String Yellow;
 private String Red;
 private String White;
 private String Black;
 private String Green;
 private Color color;
 private boolean filled;
 private String date;
 public int numberRan;
  
  public Polygon(){
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	 date = df.format(new Date());
	 Random ran = new Random();
		 numberRan = ran.nextInt(5)%5;
	switch (numberRan) {
	case 1:
		this.color=color.Yellow;
		break;
	case 2:
		this.color=color.Red;
		break;
	case 3:
		this.color= color.White;
		break;
	case 4:
		this.color=color.Black;
		break;
	case 5:
		this.color=color.Green;
		break;
	case 0:
	    break;
	default:
		break;
	}

}

  public String toString(){
	  return "The "+color.getColor()+" color polygon created in "+date;
  }
}
