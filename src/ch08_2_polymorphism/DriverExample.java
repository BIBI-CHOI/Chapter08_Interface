package ch08_2_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
	
//		Vehicle ve = new Bus();
//		Vehicle ve = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
	}

}
