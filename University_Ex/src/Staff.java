
public class Staff extends UEmployee 
{
	private String title;
	
	public Staff(String fn, String ln, double sal, String jobTitle)
	{
		super(fn, ln, sal);
		title = jobTitle;
	}
	
	public String getTitle()//Accessor Method
	{
		return title;
	}
	public void setTitle(String t)//Modifier Method
	{
		title = t;
	}
	
	public String toString()
	{
		return(super.getFirstName() +
				super.getLastName() +
				super.getSalary() +
				title);
				
	}

}
