package ConstructorAssignments;

public class Car {

	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	Car(){
		this.make = "unknown";
		this.model = "unknown";
		this.year = -1;
		
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW","X5",2023);
		Car c2 = new Car("Mahindra","W5",2022);
		Car c3 = new Car();
		System.out.println("Car 1 Information: ");
		
		System.out.println("Make: " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Year: " + c1.getYear());
		
		System.out.println();
		System.out.println("Car 2 Information: ");
		
		System.out.println("Make: " + c2.getMake());
		System.out.println("Model: " + c2.getModel());
		System.out.println("Year: " + c2.getYear());
		
		System.out.println();
		System.out.println("Car 3 Information: ");

		System.out.println("Make: " + c3.getMake());
		System.out.println("Model: " + c3.getModel());
		System.out.println("Year: " + c3.getYear());
		

	}

}
