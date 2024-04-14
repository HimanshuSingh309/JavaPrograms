package ConstructorAssignments;

public class Rectangle {
	private double length;
	private double width;
	
	Rectangle(){
		this.length = 0.0;
		this.width = 0.0;
	}
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length*width;
		
	}

	public static void main(String[] args) {
		Rectangle  r1 = new Rectangle();
		Rectangle  r2 = new Rectangle(5.4,3.2);
		
		System.out.println("Area with default values: " + r1.calculateArea());
		System.out.println("Area of rectangle with data: " + r2.calculateArea());
		
		

	}

}
