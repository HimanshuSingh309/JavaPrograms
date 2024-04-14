package InheritenceExamples;

public class TestHospital {

	public static void main(String[] args) {
		Apollo a = new Apollo();
		a.apolloHelpline();
		a.emergency();
		Max m = new Max();
		m.gynechologiest();
		m.onchology();
		Fortis f = new Fortis();
		f.citiScan();
		f.mri();
		f.onchology();
		System.out.println("----------------------------");
		
		//Top Casting/Up Casting // We cannot call the child class individual methods 
		Hospital h = new Apollo();
		h.onchology();
		h.emergency();
		
		//Down Casting // Type mismatch Cannot convert from Parent to Child. Then we have to down cast it.
		// In case of down casting it will compile successfully. but we will get the runtime exception: ClassCastException.
		Apollo a1 = (Apollo)new Hospital();
		a1.apolloHelpline();
		
		
		

	}

}
