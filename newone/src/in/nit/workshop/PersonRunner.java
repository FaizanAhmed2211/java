package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		
        Person.country="India";
		System.out.println("main method is started");
		System.out.println("country is:"+Person.country);
		Person.state="Karnataka";
		System.out.println("State is:"+Person.state);
		Person.district="Raichur";
		System.out.println("District is:"+Person.district);
		
		//object creation
		Person person=new Person();
		person.personName="Faizan Ahmed";
		person.personQualification="Bachelor of Engineering";
		person.pancardNumber="GTL90167";
		person.aadhaarCardNumber=768283913827l;
		System.out.println("PersonName:"+person.personName);
		System.out.println("Qualification:"+person.personQualification);
		System.out.println("PanCardNumber:"+person.pancardNumber);
		System.out.println("AadhaarCardNumber:"+person.aadhaarCardNumber);
		
		//static method
		Person.displayInfo();
		person.getInformation();
		

	}

}
