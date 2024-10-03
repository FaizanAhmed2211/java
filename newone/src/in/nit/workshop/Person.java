package in.nit.workshop;

public class Person {
	
	//static variables
	public static String country;
	public static String state;
	public static String district;
	
	//instance variables or non static variables
	public String personName;
	public String personQualification;
	public String pancardNumber;
	public long aadhaarCardNumber;
	
	//static method
	public static void displayInfo() {
		System.out.println("Display method is invoked");
	}
		
	//non static method
	public void getInformation() {
		System.out.println("Invoking non static Method");
	
	}

}
