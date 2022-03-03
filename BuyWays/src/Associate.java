
public class Associate extends Employee
{
	double hourlyPayRate;
	
	public Associate(String fName, String lName, double rate)
	{
		super(fName, lName);
		hourlyPayRate = rate;
	}
	
	public double getRate()//Accessor method
	{
		return hourlyPayRate;
	}
	
	public void setRate(double r)
	{
		hourlyPayRate = r;
	}
	
	public double pay(double hours)
	{
		double payEarned;
		
		if(hours > 40)
		{
			payEarned = (hourlyPayRate * 40) + ((hourlyPayRate * 1.5)*(hours - 40));
		}
		else
		{
			payEarned = hourlyPayRate * hours;
		}	
		return payEarned;
	}
	
	
	
	
	
	
	public String toString()
	{
		return(super.toString() + ", assocaite" );
				
		
	}
	

}
