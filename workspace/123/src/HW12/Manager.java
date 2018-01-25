package HW12;

public class Manager extends AbstractEmploee {
    double bonusRate;
    double salesDone;
	public Manager(double basePqy, String employeeName, double hourlyRate, double numberOfHoursWorked) {
		super(basePqy, employeeName, hourlyRate, numberOfHoursWorked);
		// TODO Auto-generated constructor stub
		salesDone = bonusRate>10000?0.15:0.1;
	}
   public double calculatePay(){
	   return numberOfHoursWorked*hourlyRate+basePqy*(1+bonusRate);
   }
   public boolean checkPromotionEligibility(){
	   if(calculatePay()>5000) return true;
	   else return false;
   }
	public double getBonusRate() {
	return bonusRate;
}
   public void setBonusRate(double bonusRate) {
	this.bonusRate = bonusRate;
}
   public double getSalesDone() {
	return salesDone;
}
   public void setSalesDone(double salesDone) {
	this.salesDone = salesDone;
}
   public String toString(){
	return "Employee name:"+employeeName+
            "\nBase Pay :$"+basePqy+
            "\nNumber of Hours worked :"+numberOfHoursWorked+
			"\nPayment Rate per hour:$"+hourlyRate+"hrs"+
			"\nPay:"+calculatePay()+"/hr"+
			"\nPromotion:"+checkPromotionEligibility();
}

}
interface IEmploee{
  public static double calculatePay(){
      return 0;
}
   public static boolean checkPromotionEligibility(){
	   return false;
  }
}
abstract class AbstractEmploee implements IEmploee{
	double basePqy;
	String employeeName;
	double hourlyRate;
	double numberOfHoursWorked;
	public AbstractEmploee(
			double basePqy,
	        String employeeName,
	        double hourlyRate,
	        double numberOfHoursWorked){
		
		this.basePqy = basePqy;
		this.employeeName = employeeName;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		
	}
	public double getBasePqy() {
		return basePqy;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	@Override
    public String toString(){
		return employeeName+basePqy+hourlyRate+numberOfHoursWorked;
    	
    }
}
