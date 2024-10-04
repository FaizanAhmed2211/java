package in.nit.workshop;

public class Subject {

	// properties of subject
	public String subjectName;
	public String subjectCode;

	// constructor
	public Subject() {
		System.out.println("default constructor");
	}

	// instance methods
	public void getSubjectDetails() {
		System.out.println("This is getSubjectDetails");
	
	}
	public void getSubjectDetails(String subjectName) {
		System.out.println("This is getSubjectDetails");
		System.out.println("subject name:"+subjectName);
	}
	public void getSubjectDetails(String subjectName,String subjectCodeName) {
		System.out.println("This is getSubjectDetails");
		System.out.println("subject name:"+subjectName);
		System.out.println("subject code:"+subjectCodeName);
	}
	//to get length of the given subject
	public void getSubjectChar(String subjectName) {
		System.out.println("finding the character count");
		System.out.println("subject char count:"+subjectName.length());
	}
	public void getSubjectChar(String subjectName,String subjectCode) {
		System.out.println("finding the character count");
		System.out.println("subject char count:"+subjectName.length());
		System.out.println("subject char count:"+subjectCode.length());
	}
	//get the word count
	public void getNumberOfWords(String sentence) {
		System.out.println("sentence is:"+sentence);
		String words[]=sentence.split(" ");
		System.out.println("Word count is:"+words.length);
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
	}
	
	
}
