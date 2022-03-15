import java.util.Scanner;
import java.text.NumberFormat;

public class FllipCoin 
{

	public static void main(String[] args) 
	{
		int flip, choice;
		int correctGuesses = 0;
		int numGuesses = 0;
		
	 NumberFormat percent = NumberFormat.getPercentInstance();
	 
	 Scanner input = new Scanner(System.in);
		
	 System.out.print("Enter 0 for heads or 1 for tails (-1 to quit): ");
	 choice = input.nextInt();
	 
	 while(choice != -1)
	 {
		 flip = (int)(Math.random() + 0.5);
		 numGuesses = numGuesses + 1;
		 
		 if(choice == flip)
		 {
			 correctGuesses = correctGuesses + 1;
			 System.out.print("Correct!");
		 }
		 else
		 {
			 System.out.print("Incorrect!");
		 }
		 System.out.print("Enter 0 for heads or 1 for tails (-1 to quit): ");
		 choice = input.nextInt();
	 }
	 System.out.println("\nThe percentage of correct guesses is " + percent.format((double)correctGuesses/(double)numGuesses));
	}

}
