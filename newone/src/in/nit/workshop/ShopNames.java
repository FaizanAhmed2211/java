package in.nit.workshop;

public class ShopNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String shopNames[]= {"Jewelry shop","pan shop","chai sutta bar"};
		for(int index=0;index<shopNames.length;index++) {
			System.out.println(shopNames[index]);
		}
		
		System.out.println("Reverse an array elements");
		for(int index=shopNames.length-1;index>=0;index--) {
			System.out.println(shopNames[index]);
			if(shopNames[index]=="pan shop") {
				System.out.println(shopNames[index]);
			}
			
		}
		

	}

}
                                                                                          