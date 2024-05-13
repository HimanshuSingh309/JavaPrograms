package methodOverloading;

public class Car {
	
	String name;
	String chasisNum;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.chasisNum = "BMW213222";
		c1.price = 50;
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.chasisNum = "BMW213222";
		c2.price = 50;
		
		Car c3 = new Car();
		c3.name = "BMW";
		c3.chasisNum = "BMW213222";
		c3.price = 50;
		
		
		// How to static variables
		//1. Use directly: Within the class
		System.out.println(wheels);
		
		// Use it with the className: From Anywhere
		
		System.out.println(Car.wheels);
		
		// Can i call the static variable with object reference name ?
								System.out.println(c1.wheels);

	}

}
