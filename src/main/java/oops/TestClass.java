package oops;

public class TestClass extends UpCastingAndDownCasting {

	public static void main(String[] args) {
		ParentCar pc = new UpCastingAndDownCasting(); // Up casting
		pc.catchParent();
		
		// When child class object is being referred by parent class reference then it is known as
		// up-casting
		
		UpCastingAndDownCasting ud = (UpCastingAndDownCasting) new ParentCar(); // down casting
		ud.catchParent();
		ud.childClass();
		
		// When parent class object is being referred by child class reference then it is known as 
		// down casting. We will get the ClassCastException while performing down casting

	}

}
