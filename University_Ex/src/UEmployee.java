
public abstract class UEmployee 
{
	private String firstName, lastName;
	private double salary;
	
	public UEmployee(String fn, String ln, double sal)
	{
		firstName = fn;
		lastName = ln;
		salary = sal;
	}
	
	public String getFirstName()//Accessor Method
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setfirstName(String fn)
	{
		firstName = fn;
	}
	public void setlastName(String ln)
	{
		lastName = ln;
	}
	public void setSalary(double s)//Modifier method
	{
		salary = s;
	}
	
	public String toString()//prints Employee Object
	{
		
		return("First Name : " 
			+ firstName 
			+ "Last Name: " + lastName
			+ "Salary: "+ salary);
		
	}
	 
	
}
