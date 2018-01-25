package HW10;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GuessingGame {
	private enum Status{CONTINUE, WON, LOST,STOP};
	private int magicNum;
	private Scanner input ;
	Status gameStatus = Status.CONTINUE;
	private int comNum,time =15;
	
	public void GuessingGame(){
		Random ran =new Random();
		magicNum = ran.nextInt(100)%(100)+1;
		this.magicNum = magicNum;
	}
	
	public void guess(){
		input = new Scanner(System.in);
		
		int getNum1 = 1,getNum2 =100,inputNum,i=0,comNum1=1,comNum2 = 100,k=0,max=100,min=1,comNum;
		Random ran =new Random();
		timeControl();//saaffafafaaffa
		do{System.out.println("------You turn: ("+getNum1+" to "+getNum2+")-------");
		inputNum = input.nextInt();
		if(inputNum==magicNum){
			
			System.out.println("you win the game");
			comNum = ran.nextInt(max)%(max-min+1)+min;
			i=1;
		}else if(inputNum<magicNum){
			System.out.println("Your input is too small");
			getNum1 =inputNum+1;
			min=inputNum+1;
			comNum = ran.nextInt(max)%(max-min+1)+min;
			i=2;}
			else{
			    getNum2 = inputNum-1;
				i=3;
				max=inputNum-1;
			   comNum = ran.nextInt(max)%(max-min+1)+min;
			    System.out.println("Your input is too big");
			}
		
		if(comNum==magicNum){
			System.out.println("******The computer guess "+comNum+" ("+min+" to "+max+"),the number is right");
			System.out.println("you lose the game");
			k=1;
		}else if(comNum<magicNum){
			System.out.println("******The computer guess "+comNum+" ("+min+" to "+max+"),the number is too small");
			comNum1 =comNum;
			k=2;
			}else{
			    comNum2 = comNum;
				k=3;
				System.out.println("******The computer guess "+comNum+" ("+min+" to "+max+"),the number is too big");
			}
		
			if(i==1||k==1){
				gameStatus = Status.WON;
			}else {
				gameStatus = Status.CONTINUE;
						if(k==1) gameStatus = Status.LOST;
			}
			
			switch (gameStatus) {
			case WON:
			System.out.println("------------------Game is Finish--------------");
				System.exit(0);
				break;
			//case CONTINUE:
			case STOP :
			    System.out.println("------------------Game is Finish--------------");
			   System.exit(0);
			   break;
			      }
		}while(true);
}
	public void timeControl() {
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
		@Override
	public void run() {
		time--;
		if(time<0 & gameStatus.equals(Status.CONTINUE)){
		gameStatus=Status.STOP;
		System.out.println("-------------------Time is up---------------");
		System.out.println("no winner");
		System.exit(0);
		}
	}
	},0,1000);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GuessingGame guess = new GuessingGame();
      guess.GuessingGame();
      guess.guess();
	}

}
