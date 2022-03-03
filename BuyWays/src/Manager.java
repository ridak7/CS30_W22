
public class Manager extends Employee
{
	double yearlySalary;
	
	public Manager(String fName, String lName, double sal)//constructor method
	{
		super(fName, lName);
		
		yearlySalary = sal;
		
	}
	
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	public void setYearlySalary(double sal)
	{
		yearlySalary = sal;
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = (yearlySalary/52)*weeks;
		return payEarned;
	}
	
	public String toString()
	{
		return(super.toString() + ", manager");
	}
	

}
