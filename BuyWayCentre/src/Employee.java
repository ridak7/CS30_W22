
public abstract class Employee 
{
	
 private String firstName, lastName;
	
	public Employee(String fname, String lname)//Constructor method
	{
		firstName = fname;
		lastName = lname;
	}
	
	public String toString()
	{
		return(firstName + " "+ lastName);
	}
	
	
	abstract double pay(double period);
	
	
	
	

}
