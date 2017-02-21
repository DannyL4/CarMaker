/*What follows describes the Car class*/

import java.util.ArrayList;
import java.util.Scanner;

public class Car implements Listing
{
	final static int MINYEAR = 2000;
	final static int MAXYEAR = MINYEAR + 18;
	final static int MINCOST = 5000;
	final static int MAXCOST = 35000;
	private int year, cost;
	private String make, model, color;
	
	@SuppressWarnings("serial")
	static ArrayList<String>  makeList = new ArrayList<String>()
	{{ 
		add("Honda");
		add("Toyota");
		add("Subaru");
		add("Mazda");
		add("Acura");
	}};
	
	@SuppressWarnings("serial")
	static ArrayList<String> hondaModelList = new ArrayList<String>()
	{{
		add("CRV");
		add("Pilot");
		add("Accord");
		add("Civic");
		add("HRV");
	}};
	
	@SuppressWarnings("serial")
	ArrayList<String> toyotaModelList = new ArrayList<String>()
	{{
                add("Camry");
	  	add("Four Runner");
	    	add("Tercel");
	    	add("Corolla");
	    	add("Avalanche");
	}};
	@SuppressWarnings("serial")
	ArrayList<String> subaruModelList = new ArrayList<String>()
	{{
		add("Legacy");
		add("Outback");
		add("Impreza");
		add("Optimo");
		add("XL200");
	}};
	@SuppressWarnings("serial")
	ArrayList<String> mazdaModelList = new ArrayList<String>()
	{{
		add("Miata");
		add("626");
		add("6LE");
		add("CX-5");
		add("3X");
	}};
	@SuppressWarnings("serial")
	ArrayList<String> acuraModelList = new ArrayList<String>()
	{{
		add("Legend");
		add("Integra");
		add("MDX");
		add("Vigot");
		add("RL");
	}};
	@SuppressWarnings("serial")
	ArrayList<String> colorList = new ArrayList<String>()
	{{
		add("Black");
		add("White");
		add("Red");
		add("Green");
		add("Blue");
	}};

	public Car() {}

	public Car(String make, String model, String color, int year, int cost) 
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.cost = cost;
	}
	
	public void displayCar() 
	{
		System.out.print("\nMake: "+ this.make + "\nModel: " + this.model + 
				"\nYear: " + this.year + "\nColor: "
				+ this.color + "\nCost: $" + this.cost + "\n");
	}
	
	public void setAll(String make, String model, String color, int year, int cost) 
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.cost = cost;
	}
	
	public void setRandom() 
	{
		int choice = (int) (Math.random() * makeList.size());
		this.make = makeList.get(choice);
		if(choice == 0) 
		{
			int option = (int) (Math.random() * hondaModelList.size());
			this.model = hondaModelList.get(option);
		} 
		else if(choice == 1) 
		{
			int option = (int) (Math.random() * toyotaModelList.size());
			this.model = toyotaModelList.get(option);
		} 
		else if(choice == 2) 
		{
			int option = (int) (Math.random() * subaruModelList.size());
			this.model = subaruModelList.get(option);
		} 
		else if(choice == 3) 
		{
			int option = (int) (Math.random() * mazdaModelList.size());
			this.model = mazdaModelList.get(option);
		} 
		else 
		{
			int option = (int) (Math.random() * acuraModelList.size());
			this.model = acuraModelList.get(option);
		}	
		int selection = (int) (Math.random() * colorList.size());
		this.color = colorList.get(selection);
		this.year = MINYEAR + (int) (Math.random() * (MAXYEAR - MINYEAR));
		this.cost = MINCOST + (int) (Math.random() * MAXCOST);
	}

	public void setUserCar() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPlease enter the vehicle make you're looking for: ");
		String make = input.nextLine();
		this.make = make;
		
		System.out.println("Please enter the particular model: ");
		String model = input.nextLine();
		this.model = model;
		
		System.out.println("Please enter the color preference: ");
		String color = input.nextLine();
		this.color = color;
		
		System.out.println("Please enter the year of the car: ");
		int year = input.nextInt();
		this.year = year;
		
		System.out.println("Please enter the cost: ");
		int cost = input.nextInt();
		this.cost = cost;
	}
	
	public static void setSearch(Car min, Car max) 
	{
		System.out.println("\n\nEntering return will simply skip the option.\n");
		
		min.setCost(ListingUtil.queryInt("Please enter the minimum amount you want to spend: "));
		max.setCost(ListingUtil.queryInt("Please enter the most you'd spend: "));
		
		min.setYear(ListingUtil.queryInt("Please enter the minimum year of the vehicle you're looking for: "));
		max.setYear(ListingUtil.queryInt("Please enter the maximum year of the vehicle you're looking for: "));
				

		min.setColor(ListingUtil.queryString("Please enter your color preference: "));
		max.setColor(ListingUtil.queryString("Please enter second color preference if applicable: "));
		
		min.setMake(ListingUtil.queryString("Please enter your vehicle make preference: "));
		max.setMake(ListingUtil.queryString("Please enter second make preference if applicable: "));
	
		min.setModel(ListingUtil.queryString("Please enter your vehicle model preference: "));
		max.setModel(ListingUtil.queryString("Please enter second model preference if applicable: "));
	}
	
	public boolean matchCriteria(Car min, Car max) 
	{
		//this if-else-if deals with cost matching
		
		if(min.cost == 0 && max.cost == 0)
		{
			//all costs apply
		}
		else if(min.cost <= cost && max.cost >= cost)
		{
			//price range match
		}
		else if(min.cost == 0 && max.cost >= cost)
		{
			//price range match
		}
		else if(max.cost == 0 && min.cost <= cost)
		{
			//price range match
		}
		else
		{
			return false;
		}

		//this if-else-if deals with checking year range
		
		if(min.year == 0 && max.year == 0)
		{
			//all years apply
		}
		else if(min.year <= year && max.year >= year)
		{
			//year range match
		}
		else if(min.year == 0 && max.year >= year)
		{
			//year range match
		}
		else if(max.year == 0 && min.year <= year)
		{
			//year range match
		}
		else
		{
			return false;
		}
		 				
		//this if-else-if deals with color matching
		
		if(max.color == null && min.color == null)
		{
			//all colors apply
		}
		else if(min.color == null && color.equalsIgnoreCase(max.color))
		{
			//color match
		}
		else if(max.color == null && color.equalsIgnoreCase(min.color))
		{
			//color match
		}
		else if(color.equalsIgnoreCase(min.color) || color.equalsIgnoreCase(max.color))
		{
			//color match
		}
		else
		{
			return false;
		}
		
		//this if-else-if deals with make matching
		
		if(min.make == null && max.make == null)
		{
			//all makes apply
		}
		else if(min.make == null && make.equalsIgnoreCase(max.make))
		{
			//make match
		}
		else if(max.make == null && make.equalsIgnoreCase(min.make))
		{
			//make match
		}
		else if(make.equalsIgnoreCase(min.make) || make.equalsIgnoreCase(max.make))
		{
			//make match
		}
		else
		{
			return false;
		}
		
		//this if-else-if deals with model matching
		
		if(min.model == null && max.model == null)
		{
			//all models apply
		}
		else if(min.model == null && model.equalsIgnoreCase(max.model))
		{
			//model match
		}
		else if(max.model == null && model.equalsIgnoreCase(min.model))
		{
			//model match
		}
		else if(model.equalsIgnoreCase(min.model) || model.equalsIgnoreCase(max.model))
		{
			//model match
		}
		else
		{
			return false;
		}
		
		return true;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}

	public String getMake() 
	{
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
}
