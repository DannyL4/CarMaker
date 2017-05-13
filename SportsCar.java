
public class SportsCar extends Car
{
	private int horsePower;
	private float accelTime;
	
	public static void main(String[] args) 
	{
		SportsCar first = new SportsCar();
		first.setAll("Ferrari", "Testarossa", "Matte Black", 2015, 45000, 550, 4.45f);
		first.print();
	}
	
	
	
	public void print()
	{
		super.print();
		System.out.println("HorsePower: " + this.horsePower + "\nAcceleration Time: " + this.accelTime);
	}

	public void setAll(String make, String model, String color, int year, int cost, int horsePower, float accelTime)
	{
		super.setAll(make, model, color, year, cost);
		this.setHorsePower(horsePower);
		this.setAccelTime(accelTime);
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
