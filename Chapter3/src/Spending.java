import java.text.NumberFormat;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		int food, clothing, entertainment, rent;
		double totalExpenditure, foodPercent, clothingPercent, entertaiPercent, rentPercent;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount spent last month on the following items: \n");
		System.out.println("Food: $");
		food = input.nextInt();
		System.out.println("Clothing: $");
		clothing = input.nextInt();
		System.out.println("Entertainment: $");
		entertainment = input.nextInt();
		System.out.println("Rent: $");
		rent = input.nextInt();
		
		totalExpenditure = (food + clothing + entertainment + rent);
		foodPercent = (food / totalExpenditure);
		clothingPercent = (clothing / totalExpenditure);
		entertaiPercent = (entertainment / totalExpenditure);
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		System.out.println("Category \t\t\t Budget");
		System.out.println("Food: " + food +" \t\t\t " + nf.format(foodPercent));
		System.out.println("Clothing: " + clothing +" \t\t\t " + nf.format(clothingPercent));
		System.out.println("entertainment: "+ entertainment  +" \t\t " + nf.format(entertaiPercent));
	}

}
