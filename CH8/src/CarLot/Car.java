package CarLot;

public class Car extends Vehicle 
{
	
	public Car(int fECity, int fEHwy, int seating, double trunkSpace) 
	{
		super(fECity, fEHwy, seating, trunkSpace);
	}


	public String cargoContainer() 
	{
		String cargoArea;
		
		cargoArea = "Trunk space is " + super.getCargoVolume();
		return(cargoArea);
	}	
	
	public String description() 
	{
		String car;
		
		car = "This car can seat " + super.getSeating() + " passengers.\n";
		car += "The car has a cargo volume of " + super.getCargoVolume() + ".\n";
		car += "The fuel economy is " + super.getFECity() + " city and " + super.getFEHwy() + "  highway miles.\n";
		return(car);
	}
}
