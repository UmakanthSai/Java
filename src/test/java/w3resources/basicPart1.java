package w3resources;

import java.util.Scanner;

public class basicPart1 {

    public void java_15(){
        //Write a Java program to swap two variables
        int a=5,b=7;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("print: "+a+","+b);

    }
    
    public void jav_37() {
    	//Write a Java program to reverse a string
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a String input: ");
    	char[] input = scan.next().toCharArray(); 
    	int numof_char = input.length;
    	for(int i=numof_char-1; i>=0; i--) {
    		System.out.print(input[i]);
    	}
    	scan.close();
    }

    public static void main(String arg[]){
        basicPart1 obj = new basicPart1();
       // obj.java_15();
        obj.jav_37();
    }
}
