package practise;

import java.util.Scanner;

public class Swap {
	
	//Swap numbers without 3rd variable
	void swap_number() {
		int a, b;
		//Scanner scan = new Scanner(null);
		
		//a= scan.nextInt(); b= scan.nextInt();
//		a = a+b;
//		b=a-b;
//		a=a-b;
//		
		//System.out.println("a ="+a+", b ="+b);
	}

	void triangle() {
		
		int row =5;
		for(int i=1;i<row; i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void reverse_traingle() {
		//x for rows, y for columns, and row denotes the number of rows to print 
		int x, y, row=5; 
		//outer loop for number of rows 
		for(x=0; x<row; x++) 
		{ 
		//inner loop for columns 
		for(y=2*(row-x); y>=0; y--) 
		{ 
		//To prints spaces
		System.out.print(" "); 
		}
		//Inner loop for columns
		for(y=0; y<=x; y++)
		{
		//To prints stars
		System.out.print("* ");
		}
		//Cursor goes to the new line after printing each line
		System.out.println();
		} 
		}	
	
	public static void main(String[] args) {
	
//		Swap obj = new Swap();
//		//obj.swap_number();
//		//obj.triangle();
//		obj.reverse_traingle();

		C_class c = new C_class();
	}

}
