package encapsulationExamples;

public class PersonInfo {
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
		else
			System.out.println("Age can't be negative");
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}

	public static void main(String[] args) {
		PersonInfo p1 = new PersonInfo();
		p1.setName("Himanshu");
		p1.setAge(29);
		p1.setGender("Male");
		p1.printInfo();
		
		

	}

}
