//Gabe Darnell
public class Truck extends Vehicle
{
	double loadCapacity;
	double towingCapacity;
	
	public Truck()
	{
		super();
		loadCapacity = 0.0;
		towingCapacity = 0.0;
	}
	
	public Truck(String xName, int xNumCylinders, String xOwnerName, double xLoadCapacity, double xTowingCapacity)
	{
		super(xName, xNumCylinders, xOwnerName);
		this.loadCapacity = xLoadCapacity;
		this.towingCapacity = xTowingCapacity;
	}
	
	//Accsessors
	public double getLoadCapacity()
	{
		return this.loadCapacity;
	}
	
	public double getTowingCapacity()
	{
		return this.towingCapacity;
	}
	
	//Mutators
	public void setLoadCapacity(double xLoadCapacity)
	{
		this.loadCapacity = xLoadCapacity;
	}
	
	public void setTowingCapacity(double xTowingCapacity)
	{
		this.towingCapacity = xTowingCapacity;
	}
	
	//Other Methods
	public boolean equals()
	{
		return this.loadCapacity == getLoadCapacity() && this.towingCapacity == getTowingCapacity();
	}

}
