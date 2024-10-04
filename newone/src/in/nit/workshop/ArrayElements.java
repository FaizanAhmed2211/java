package in.nit.workshop;

public class ArrayElements {
	
	
	public static void main(String args[]) {
		
		//declare array
		String names[]={"Deepak","Yaqoob","Miskin","Ahmed"};
		int[] numbers={1,2,3,4};
		char []ch={'A','B','C'};
		System.out.println("Names:"+names.length);
		System.out.println("Numbers:"+numbers.length);
		System.out.println("Ch:"+ch.length);
		//display array elements
		System.out.println("diaplaying array elements");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);	
	}

}
