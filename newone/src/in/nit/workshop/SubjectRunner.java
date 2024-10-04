package in.nit.workshop;

public class SubjectRunner {

	public static void main(String[] args) {

		Subject subject1 = new Subject();
		subject1.getSubjectDetails();
		subject1.getSubjectDetails("maths");
		subject1.getSubjectDetails("Physics", "21EC031");
		subject1.getSubjectChar("mathematics");
		subject1.getSubjectChar("maths", "21ec031");

	}

}
