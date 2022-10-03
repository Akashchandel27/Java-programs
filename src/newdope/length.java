package newdope;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		
		
		// Take values of length and breadth of a rectangle from user and check if it is square or not.
		  int length;
		  int breadth;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter length");
		  length=sc.nextInt();
		  System.out.println("the length is " +length);
		  
		  System.out.println("enter breadth");
		  breadth= sc.nextInt();
		  System.out.println("the length is " +breadth);
		  
		  System.out.println("Area of rectangle is" +length*breadth);
		  
		  if (length == breadth) {
			  System.out.println("Sqaure");
		  }
		  else{
			  System.out.println("Rectangle");
		  }
		  
		  sc.close();

	}

}
