package softwareTestingo;

public class Pyramid_Questions {

	private void pyramid1() {
	
	//Print the below
	//*
	//***
	//*****
	//*******
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	void pyramid2(){
		
	   }
	

	
	
	public static void main(String[] args) {
		
		Pyramid_Questions obj = new Pyramid_Questions();
		obj.pyramid1();

	}
}
