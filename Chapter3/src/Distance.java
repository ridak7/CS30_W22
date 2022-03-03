import java.util.Scanner;

public class Distance 
{
	public static void main(String[] args) 
	{
		double first, second, third, distance; //declaration area
		
		Scanner input = new Scanner(System.in);//Ready for input
		
		// Ask for the first segment
		System.out.println("Enter the distance of the first segment: ");
		
		//record first segment
		first = input.nextDouble();
		
		System.out.println("Enter the distance of the second segment: ");
		
		second = input.nextDouble();
		
		System.out.println("Enter the distance of the third segment: ");
		
		third = input.nextDouble();
		
		//calculate the total distance
		distance  = first +  second + third;
		
		//output the total distance
		System.out.println("The total distance of the race is:"+ distance + "km");
	}
	

}//End of Class

/* Screen Dump
Enter the distance of the first segment: 
3
Enter the distance of the second segment: 
5
Enter the distance of the third segment: 
7
The total distance of the race is:15.0km
 
 */
