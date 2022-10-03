package newdope;

import java.util.Scanner;

public class greatestof2number {

	public static void main(String[] args) {
		
		// Take two int values from user and print greatest among them.
		 int a;
		 int b;
		 
		 Scanner in = new Scanner(System.in);
		 // First number
		 System.out.println("ënter the first number");
		 a=in.nextInt();
	     System.out.println("First number is" +a );
	     
	     // Second number
	     System.out.println("ënter the second number");
		 b=in.nextInt();
	     System.out.println("First number is" +b );
	     
	     if(a>b) {
	    	 System.out.println("a is greater");
	     }
	     else {
	    	 System.out.println("b is greater");
	     }
		 
		 in.close();

	}

}
