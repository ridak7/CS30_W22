
public class Manager extends Employee
{
	
	private double yearlySalary;
	
	public Manager(String fName, String lName, double sal)//Constructor Method
	{
		super(fName, lName);
		
		yearlySalary = sal;
		 		
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = (yearlySalary/52) * weeks;
		return payEarned;
	}
	
	public String toString()
	{
		return( "Manager" + super.toString() 
				+ "Salary: "
				+ yearlySalary);
	}
	
	

}
