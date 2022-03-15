import java.util.Scanner;

public class TimeConv 
{
  public static void hoursToMins()
  {
	int hours, mins;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of hours: ");
	hours = input.nextInt();
	mins = hours * 60;
	
	System.out.println("There are "+
						mins + "minutes in"+
						hours + "hours.");
  }
	
  public static void daysToHours()
  {
	int days, hours;
	Scanner input = new Scanner(System.in);
	  
	System.out.println("Enter the number of days: ");
	days = input.nextInt();
	
	hours = days * 24;
	
	System.out.println("There are "+
						hours + "hours in"+
						days + "days.");
	
	
	
  }
  
  public static double AreaRect()
	{
		double Area;
		Area = 4 * 3;
		
		return Area;
	}
  
	
	

	
	
	
	
	public static void main(String[] args) 
	{
		/*
		int choice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Hours to minutes.");
		System.out.println("2. Days to hours.");
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1: hoursToMins(); break;
			case 2: daysToHours(); break;
		}
			*/
		
		double someSpace = AreaRect();
	}

}
