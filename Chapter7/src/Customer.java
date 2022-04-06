
public class Customer 
{
	
	private String firstName;
	private String lastName;
	private String Address;
	
	
	//Constructor Method	
	public Customer(String fn, String ln, String add) 
	{
		firstName = fn;
		lastName =  ln;
		Address = add;
	}
	//Accessor Methods
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return Address;
	}
	
	//Modifier Methods
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	public void setLastName(String ln)
	{
		lastName = ln;
	}
	public void setAddress(String ad)
	{
		Address = ad;
	}
}
