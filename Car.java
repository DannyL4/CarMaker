/*What follows describes the Car class*/

import java.util.ArrayList;
import java.util.Scanner;

//we want Car to extend the abstract RoadVehicle class which implements Listing
public class Car extends RoadVehicle implements Listing
{
	final static int MINYEAR = 2000;
	final static int MAXYEAR = MINYEAR + 18;
	final static int MINCOST = 5000;
	final static int MAXCOST = 35000;
	/*private int year, cost;
	private String make, model, color;*/
	
	SearchCriteria criteria = new SearchCriteria();
	
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
		add("black");
		add("white");
		add("red");
		add("green");
		add("blue");
	}};

	public Car() 
	{
		
	}
	
	public Car(int year, String make, String model, String color, int cost) 
	{
		super(year, make, model, color, cost);
	}
	
	public void print() 
	{
		System.out.print("\nYear: " + this.year + "\nMake: " + this.make +
				"\nModel: " + this.model + "\nColor: "
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
		String model = input.nextLine().toLowerCase().trim();
		this.model = model;
		
		System.out.println("Please enter the color preference: ");
		String color = input.nextLine();
		this.color = color;
		
		System.out.println("Please enter the year of the car: ");
		int year = input.nextInt();
		this.year = year;
		
		System.out.println("Please enter how much you're willing to spend: ");
		int cost = input.nextInt();
		this.cost = cost;
	}
	
	public static void setSearch(SearchCriteria criteria) 
	{
		System.out.println("\n\nEntering return will simply skip the option.\n");
		
		criteria.setMinCost(ListingUtil.queryInt("Please enter the minimum amount you want to spend: "));
		criteria.setMaxCost(ListingUtil.queryInt("Please enter the most you'd spend: "));
		
		criteria.setMinYear(ListingUtil.queryInt("Please enter the minimum year of the vehicle you're looking for: "));
		criteria.setMaxYear(ListingUtil.queryInt("Please enter the maximum year of the vehicle you're looking for: "));
				

		criteria.setColor(ListingUtil.queryString("Please enter your color preference: "));
		//max.setColor(ListingUtil.queryString("Please enter second color preference if applicable: "));
		
		criteria.setMake(ListingUtil.queryString("Please enter your vehicle make preference: "));
		//max.setMake(ListingUtil.queryString("Please enter second make preference if applicable: "));
	
		criteria.setModel(ListingUtil.queryString("Please enter your vehicle model preference: "));
		//max.setModel(ListingUtil.queryString("Please enter second model preference if applicable: "));
	}
	
	public boolean matchCriteria(SearchCriteria criteria) 
	{
		//this if-else-if deals with cost matching
		
		if(criteria.getMinCost() == 0 && criteria.getMaxCost() == 0)
		{
			//all costs apply
		}
		else if(criteria.getMinCost() <= cost && criteria.getMaxCost() >= cost)
		{
			//price range match
		}
		else if(criteria.getMinCost() == 0 && criteria.getMaxCost() >= cost)
		{
			//price range match
		}
		else if(criteria.getMaxCost() == 0 && criteria.getMinCost() <= cost)
		{
			//price range match
		}
		else
		{
			return false;
		}

		//this if-else-if deals with checking year range
		
		if(criteria.getMinYear() == 0 && criteria.getMaxYear() == 0)
		{
			//all years apply
		}
		else if(criteria.getMinYear() <= year && criteria.getMaxYear() >= year)
		{
			//year range match
		}
		else if(criteria.getMinYear() == 0 && criteria.getMaxYear() >= year)
		{
			//year range match
		}
		else if(criteria.getMaxYear() == 0 && criteria.getMinYear() <= year)
		{
			//year range match
		}
		else
		{
			return false;
		}
		 				
		//this if-else-if deals with color matching
		
		if(criteria.getColor() == null)
		{
			//color match
		}
		else if(color.equalsIgnoreCase(criteria.getColor().trim()))
		{
			//color match
		}
		else
		{
			return false;
		}
		
		//this if-else-if deals with make matching
		
		if(criteria.getMake() == null)
		{
			//all makes apply
		}
		else if(make.equalsIgnoreCase(criteria.getMake().trim()))
		{
			//make match
		}
		else
		{
			return false;
		}
		
		//this if-else-if deals with model matching
		
		if(criteria.getModel() == null)
		{
			//all models apply
		}
		else if(model.equalsIgnoreCase(criteria.getModel().trim()))
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
