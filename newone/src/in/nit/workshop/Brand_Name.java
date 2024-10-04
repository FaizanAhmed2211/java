package in.nit.workshop;

public class Brand_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brands[]= {"Quartz","Bata","Raymonds","Linen","Gucci"};
		System.out.println("Brands:"+brands.length);
		for(int index=0;index<brands.length;index++) {
			System.out.println(brands[index]);
		}
		System.out.println("Reversing array elements");
		for(int index=brands.length-1;index>=0;index--) {
			System.out.println(brands[index]);
		}

		
		//number
		//get the sum of array elements
		//sum
		int number[]= {2,4,5,8,9};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
			sum=sum+number[i];
			
		}
		System.out.println("sum:"+sum);
		 
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]*number[i]);
			
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]*number[i]*number[i]);
		}
		
		
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
				System.out.println("It is an even number:"+number[i]);
				
			}else {
				System.out.println("It is an odd number:"+number[i]);
			}
			
		}
	}

}
