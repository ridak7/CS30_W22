
public abstract class Employee 
{
	String firstName, lastName;
	
	public Employee(String fname, String lname) //constructor method
	{
		firstName = fname;
		lastName = lname;
	}
	
	public String toString()
	{
		return(firstName + " "+ lastName);
	}
	
	abstract double pay(double period);//signature of a method

}
