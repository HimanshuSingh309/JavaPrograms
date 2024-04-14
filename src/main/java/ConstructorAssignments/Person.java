package ConstructorAssignments;

public class Person {
	
	String name;
	private int age;
	private char gender;
	private double height;
	
	Person(String name, int age, char gender, double height){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getHeight() {
		return height;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Himanshu", 30, 'M', 5.7);
		Person p2 = new Person("Megha", 27, 'F', 5.3);
		
		System.out.println("Person 1 information:");
		
		System.out.println("Name: " + p1.getName());
		System.out.println("age: " + p1.getAge());
		System.out.println("gender: " + p1.getGender());
		System.out.println("Height: " + p1.getHeight());
		
		System.out.println();
		System.out.println("Person 2 information:");
		
		System.out.println("Name: " + p2.getName());
		System.out.println("age: " + p2.getAge());
		System.out.println("gender: " + p2.getGender());
		System.out.println("Height: " + p2.getHeight());
		
	}

}
