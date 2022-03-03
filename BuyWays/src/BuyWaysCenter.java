import java.text.NumberFormat;
import java.util.Scanner;

public class BuyWaysCenter 
{

	public static void payEmployee(Employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		System.out.println(money.format(pay));
	}
	
	
	public static void main(String[] args) 
	{
		Manager emp1 = new Manager("Diego", "Martin", 60000);
		Associate  emp2 = new Associate("Kylie", "Walter", 18.50);
		Associate emp3 = new Associate("Michael", "Rose", 16.75);
		
		Scanner input = new Scanner(System.in);
		String action;
		int empNum;
		double payArg;
		
		Employee emp = emp1;//set to default employee
		
		do
		{
			System.out.println("\n Employee \\ Pay \\ Quit");
			System.out.println("Enter choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter employee number(1, 2, or 3): ");
				empNum = input.nextInt();
				
				switch(empNum)
				{
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
					case 3: emp = emp3; break;
				}
				if(action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if(action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter the hours for associate OR pay period for manager");
					payArg = input.nextDouble();
					payEmployee(emp, payArg);
				}
			
		
			}
			
		}while(!action.equalsIgnoreCase("Q"));
		
		
		

	}

}
