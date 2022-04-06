package CarLot;

public class MiniVan extends Vehicle 
{
	public MiniVan(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	public String cargoContainer() 
	{
		String cargoArea;
		
		cargoArea = "The cargo hold is " + super.getCargoVolume();
		return(cargoArea);
	}
	
	public String description() 
	{
		String van;
		
		van = "This minivan can seat " + super.getSeating() + " passengers.\n";
		van += "The cargo space volume is " + super.getCargoVolume() + ".\n";
		van += "The fuel economy is " + super.getFECity() + " city and " + super.getFEHwy() + "  highway miles.\n";
		return(van);
	}
}
