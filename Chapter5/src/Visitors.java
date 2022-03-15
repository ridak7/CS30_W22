import java.util.Scanner;

public class Visitors {

	public static void main(String[] args) 
	{
		int numVisitors;
		int totalVisitors = 0;
		int avgVisitors = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int day = 1; day <= 5; day++)
		{
			System.out.print("Enter the number of visitors on day" + day + ": ");
			numVisitors = input.nextInt();
			totalVisitors = totalVisitors + numVisitors;
		}
		avgVisitors = (totalVisitors / 5);
		System.out.print("The average number of visitors is " + avgVisitors);

	}

}
