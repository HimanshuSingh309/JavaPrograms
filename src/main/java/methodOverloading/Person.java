package methodOverloading;

public class Person {

	// 0 param
	public void test() {
		System.out.println("Test method with Zero param");
	}

	// 1 param
	public void test(int a) {
		System.out.println("Test method with 1 int param: " + a);

	}

	// 2 param
	public void test(int a, int b) {
		System.out.println("Test method with 2 param(Different Num of parameters): " + a + b);

	}

	// 1 param with different type
	public void test(String b) {
		System.out.println("Test method with 1 String param: " + b);

	}

	// 2 param
	public void test(int c, String d) {
		System.out.println("Test method with 2 param (int, String): " + c + d);

	}

	// 2 param with different sequence
	public void test(String d, int c) {
		System.out.println("Test method with 2 param(String, int): " + d + c);

	}

	// Practical use case
	// Let's take example of Ecomm Application
	// Login feature

	public void login(String username, String Pwd) {

	}

	public void login(String username, String Pwd, int otp) {

	}

	public void login(String username, String Pwd, String phone) {

	}

	public void login(int phone, int otp) {

	}

	public void login(String email) {

	}

	// Practical use case
	// Let's take example of Ecomm Application
	// Search feature

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String deliveryDay, String newArrivals) {

	}

	public void search(String productName, int price, String OS) {

	}

	public void search(String BrandName, String productName) {

	}

	public void search(int price, String Brand) {

	}
	// Practical use case
	// Let's take example of Ecomm Application
	// Payment feature

	public void payment(String upi) {

	}

	public void payment(String netBanking, String Pwd) {

	}

	public void payment(String cc, int cvv) {

	}
	
	// Ola/ Uber
	int baseFarePerKm = 12;
	int farePerMinute = 10;
	int premiumServiceCharge = 100;
	// Method to calculate fare based on distance
    public double calculateFare(double distance) {
        // Calculate fare based on distance
    	double fare = distance * baseFarePerKm;
        return fare;
    }

    // Method overloading to calculate fare based on distance and time
    public double calculateFare(double distance, int time) {
        // Calculate fare based on distance and time
        double fare = distance * baseFarePerKm + time * farePerMinute;
        return fare;
    }

    // Method overloading to calculate fare with additional services
    public double calculateFare(double distance, int time, boolean premiumService) {
        // Calculate fare based on distance, time, and premium service
        double fare = distance * baseFarePerKm + time * farePerMinute;
        if (premiumService) {
            fare += premiumServiceCharge;
        }
        return fare;
    }
    
    // Banking Application
    
    public void openAccount(String customerName, String address, String contactNumber, String accountType) {
        // Logic to create a new account with default initial deposit
    }

    public void openAccount(String customerName, String address, String contactNumber, String accountType, double initialDeposit) {
        // Logic to create a new account with specified initial deposit
    }

    public void openAccount(String customerName, String address, String contactNumber, String accountType, double initialDeposit, String securityDetails) {
        // Logic to create a new account with specified initial deposit and security details
    }
    public void openAccount
    (String customerName, String address, String contactNumber, String accountType, double initialDeposit, String securityDetails,String NomineeDetails) {
        // Logic to create a new account with specified initial deposit and security details
    }

	public static void main(String[] args) {

		Person p = new Person();
		p.test(5);
		p.test(10, 20);

	}

}
