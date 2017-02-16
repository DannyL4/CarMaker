//import javax.swing.JOptionPane;

public class TestCar {
	
	public static void main(String[] args) 
	{	
		Car first = new Car(); 
		Car second = new Car( "BMW", "500SL", "Silver", 2008, 47300);
		
		//displaying first and second car objects constructed with the above arguments
		//the first Car will be displayed with the Java default values
		System.out.println("\nHere are the details of the first Car:");
		first.displayCar();
		System.out.println("\nHere are the details of the second Car:");
		second.displayCar();
		
		//using setters to change arguments of first car object and then displaying it
		first.setMake("Hyundai");
		first.setModel("XG-350");	
		first.setColor("Navy");
		first.setYear(1998);
		first.setCost(27000);
		System.out.print("\nHere are the details of the first Car after using the setter methods from the Car CLass:\n");
		first.displayCar();
		
		//randomly creating and then displaying the third Car object
		Car third = new Car();
		System.out.println("\nHere are the details of the randomly generated Car:");
		third.setRandom();
		third.displayCar();
		
		//creating and displaying the fourth Car object based off of user input
		Car fourth = new Car();
		fourth.setUserCarPreferance();
		fourth.displayCar();
		
		/*JOptionPane.showMessageDialog(null, "Make: " + second.getMake() + "\nModel: " + second.getModel() +
				"\nColor: " + second.getColor() + "\nYear: " + second.getYear() + "\nCost: " + second.getCost());
	*/}	
}
