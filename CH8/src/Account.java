
public class Account 
{
	double balance;
	

	public Account() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void withDraw(double amt)
	{
		if(amt <= balance)
		{
			balance = balance - amt;
		}
		
	}

}
