package in.nit.workshop;

public class Mobile {
	
	 public static void login(String email,String password) {
		 System.out.println("Enter your EmailId:"+email);
		 System.out.println("Enter your password:"+password);
	 }
	 
	 public static void email(String to,String cc,String subject,String content) {
		 System.out.println("Email To:"+to);
		 System.out.println("CC:"+cc);
		 System.out.println("Subject:"+subject);
		 System.out.println("Email:"+content);
	 }
      
	 
}
