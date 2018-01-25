package HW12;

import java.util.Scanner;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		   System.out.print("Please input the name:");
        String employeeName = input.nextLine();
           System.out.print("Please input the sales that has been finished:");
        double salesDone = input.nextDouble();
		   System.out.print("Please input the number of hours worked:");
		double numberOfHoursWorked = input.nextDouble();
		   System.out.print("Please input the hourly rate:");
		double hourlyRate = input.nextDouble();
		System.out.print("Please input the base pay:");
		double basePqy = input.nextDouble();
		Manager manager = new Manager(basePqy, employeeName, hourlyRate, numberOfHoursWorked);
		   manager.setSalesDone(salesDone);
		   System.out.println(manager.toString());
	}

}
