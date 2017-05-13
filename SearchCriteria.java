
public class SearchCriteria
{
	private String make, model, color;
	private int minYear, maxYear, minCost, maxCost, horsePower;
	private float accelTime;
	
	public static void main(String[] args)
	{
		SearchCriteria criteria = new SearchCriteria("Lamborghini", "Merci Lago", "Matte Black", 2000, 2010, 7500, 25000, 300, 4.2f);
		criteria.print();
	}
	
	public SearchCriteria()
	{
		
	}
	
	public SearchCriteria(String make, String model, String color, int minYear, int maxYear, int minCost, int maxCost, int horsePower, float acceltime)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.minYear = minYear;
		this.maxYear = maxYear;
		this.minCost = minCost;
		this.maxCost = maxCost;
		this.horsePower = horsePower;
		this.accelTime = acceltime;
	}
	
	public void print()
	{
		System.out.println("\nMake: "+ this.make + "\nModel: " + this.model + "\nColor: " + this.color + 
				"\nMin Year: " + this.minYear + "\nMax Year: " + this.maxYear + "\nMinimum Cost: $" + this.minCost + 
				"\nMaximum Cost: $" + this.maxCost + "\nHorsePower: " + this.horsePower + "\nAcceleration Time: " + this.accelTime);
		
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) 
	{
		this.make = make;
	}
	
	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public int getMinYear() 
	{
		return minYear;
	}
	
	public void setMinYear(int minYear) 
	{
		this.minYear = minYear;
	}
	
	public int getMaxYear() 
	{
		return maxYear;
	}
	
	public void setMaxYear(int maxYear) 
	{
		this.maxYear = maxYear;
	}
	
	public int getMinCost() 
	{
		return minCost;
	}
	
	public void setMinCost(int minCost) 
	{
		this.minCost = minCost;
	}
	
	public int getMaxCost() {
		return maxCost;
	}
	
	public void setMaxCost(int maxCost) 
	{
		this.maxCost = maxCost;
	}
	
	public int getHorsePower() 
	{
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) 
	{
		this.horsePower = horsePower;
	}
	
	public float getAccelTime() 
	{
		return accelTime;
	}
	
	public void setAccelTime(float accelTime) 
	{
		this.accelTime = accelTime;
	}
	
	
	
	
	
	

}
