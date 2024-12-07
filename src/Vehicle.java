//Gabe Darnell
public class Vehicle 
{
	 String name;
	 int numCylinders;
	 String ownerName;
	
	//Default Constructor
	public Vehicle()
	{
		name = "dealer";
		numCylinders = 1;
		ownerName = "jeff";
	}
	
	//Parameterized Constructor
	public Vehicle(String xName, int xNumCylinders, String xOwnerName)
	{
		this.setName(xName);
		this.setNumCylinders(xNumCylinders);
		this.setOwnerName(xOwnerName);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getNumCylinders()
	{
		return this.numCylinders;
	}
	
	public String getOwnerName()
	{
		return this.ownerName;
	}
	
	//Mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setNumCylinders(int xNumCylinders)
	{
		this.numCylinders = xNumCylinders;
	}
	
	public void setOwnerName(String xOwnerName)
	{
		this.ownerName = xOwnerName;
	}
	
	//Other Methods
	public String toString()
	{
		return "Brand Name: " + this.name + "Number of Cylinders: " + this.numCylinders + "Owner Name: " +this.ownerName;
	}
	
	public boolean equals(Vehicle v)
	{
		return v.getName().equals(this.name) && v.getNumCylinders() == this.numCylinders && v.getOwnerName().equals(this.ownerName);
	}
}
