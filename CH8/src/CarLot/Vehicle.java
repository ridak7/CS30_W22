package CarLot;

public abstract class Vehicle 
{
	private int fuelEconomyCity, fuelEconomyHwy;
	private int seatingCapacity;
	private double cargoVolume;

	
	public Vehicle(int fECity, int fEHwy, int seating, double cargo) {
		fuelEconomyCity = fECity;
		fuelEconomyHwy = fEHwy;
		seatingCapacity = seating;
		cargoVolume = cargo;
	}
	
	 public double getCargoVolume() 
	 {
		 	return(cargoVolume);
		 }
	
	 public int getFEHwy() 
	 {
	 	return(fuelEconomyHwy);
	 }

	 public int getFECity() 
	 {
	 	return(fuelEconomyCity);
	 }

	 public int getSeating() 
	 {
	 	return(seatingCapacity);
	 }
	
	 abstract String description();
}
