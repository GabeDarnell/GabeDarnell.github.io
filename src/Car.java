//Gabe Darnell
public class Car extends Vehicle
{
	double gasMileage;
	int numOfPassengers;
	
	public Car()
	{	
		super();
		gasMileage = 0.0;
		numOfPassengers = 0;
	}
	
	public Car(String xName, int xNumCylinders, String xOwnerName, double xGasMileage, int xNumPassengers)
	{
		super(xName, xNumCylinders, xOwnerName);
		this.gasMileage = xGasMileage;
		this.numOfPassengers = xNumPassengers;
	}
	
	//Accessors
	public double getGasMileage()
	{
		return this.gasMileage;
	}
	
	public int getNumPassengers()
	{
		return this.numOfPassengers;
	}
	
	//Mutators
	public void setGasMileage(double xGasMileage)
	{
		this.gasMileage = xGasMileage;
	}
	
	public void setNumPassengers(int xNumPassengers)
	{
		this.numOfPassengers = xNumPassengers;
	}
	
	//Other Methods
	public boolean equals(Car c)
	{
		return this.gasMileage == getGasMileage() && this.numOfPassengers == getNumPassengers();
	}
	
	public String toString()
	{
		return "Gas Mileage: " + this.gasMileage + "Number of Passengers: " + this.numOfPassengers;
	}
}
