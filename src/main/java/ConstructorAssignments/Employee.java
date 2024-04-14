package ConstructorAssignments;

public class Employee {
	
	    // Instance variables
	    private int id;
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Setter method for giving a raise
	    public void giveRaise(double percentage) {
	        if (percentage > 0) {
	            salary += salary * (percentage / 100);
	        }
	    }

	    public static void main(String[] args) {
	        // Creating an instance of the Employee class
	        Employee employee1 = new Employee(101, "John Doe", 50000.0);

	        // Printing out employee's information using getter methods
	        System.out.println("Employee Information:");
	        System.out.println("ID: " + employee1.getId());
	        System.out.println("Name: " + employee1.getName());
	        System.out.println("Salary: $" + employee1.getSalary());

	        // Giving the employee a 10% raise
	        employee1.giveRaise(10);

	        // Printing updated salary
	        System.out.println("\nAfter giving a raise:");
	        System.out.println("Salary: $" + employee1.getSalary());
	    }
	}
