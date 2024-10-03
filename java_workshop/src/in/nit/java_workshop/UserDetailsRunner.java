package in.nit.java_workshop;

public class UserDetailsRunner {

	public static void main(String[] args) {
	System.out.println("main method started");
	
	
    UserDetails faizan= new UserDetails();
    System.out.println("user details:"+faizan);
    faizan.userId=12;
    faizan.userName="Faizan";
    faizan.age=21;
    faizan.gender="Male";
    faizan.userEmailId="faizan22@gmail.com";
    faizan.password="faizainahmed";
    faizan.dateOfBirth="20/04/2003";
    System.out.println("user Id:"+faizan.userId);
    System.out.println("user name:"+faizan.userName);
    System.out.println("age:"+faizan.age);
    System.out.println("gender:"+faizan.gender);
    System.out.println("Email ID:"+faizan.userEmailId);
    System.out.println("Password:"+faizan.password);
    System.out.println("DOB:"+faizan.dateOfBirth);
	}

}
