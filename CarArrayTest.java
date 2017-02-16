
public class CarArrayTest {
	
	public static void main(String[] args) {
		
		Car carArray[] = new Car[15];
		for(int i = 0; i < 15; i++) {
			Car entry = new Car();
			carArray[i] = entry.setRandom();	
		}
		for(int j = 0; j < 15; j++) {
			carArray[j].printCar();
		}		
	}

}
