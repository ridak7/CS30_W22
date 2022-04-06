import java.util.Scanner;

public class MathQuiz 
{
	public static void simple(int questions)
	{
		int x, y, answer;
		int totalCorrect = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i <= questions; i++)
		{
			x = (int)(11 * Math.random());
			y = (int)(11 * Math.random());
			
			System.out.print("What is "+ x + " +  "+ y + "?" );
			answer = input.nextInt();
			
			if((x + y) == answer)
			{
				System.out.println("Correct!");
				totalCorrect = totalCorrect + 1;
			}
			else
			{
				System.out.println("Incorrect - the answer is "+ (x + y) );
			}
		}//ends the for loop
		
		System.out.println("\n You answered "+ totalCorrect + "out of"+ questions + "questions correctly.");
	}
	
	
	public static void hard(int questions)
	{
		int x, y, answer;
		int totalCorrect = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i <= questions; i++)
		{
			x = (int)(11 * Math.random());
			y = (int)(11 * Math.random());
			
			System.out.print("What is "+ x + " *  "+ y + "?" );
			answer = input.nextInt();
			
			if((x * y) == answer)
			{
				System.out.println("Correct!");
				totalCorrect = totalCorrect + 1;
			}
			else
			{
				System.out.println("Incorrect - the answer is "+ (x * y) );
			}
		}//ends the for loop
		
		System.out.println("\n You answered "+ totalCorrect + "out of"+ questions + "questions correctly.");
	}
	
		
	public static void main(String[] args) 
	{
		String quizlevel;
		int numQuestions;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the math quiz level ((s)simple or (h)hard): ");
		quizlevel = input.next();
		
		System.out.print("How many questions? ");
		numQuestions = input.nextInt();
		
		if(quizlevel.compareTo("s") == 0)
		{
			simple(numQuestions);
		}
		else
		{
			hard(numQuestions);
		}
		

	}

}
