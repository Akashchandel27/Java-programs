package newdope;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		
		int a,b;
		System.out.println("*******Welcome to SHOP*****");
		System.out.println("Please enter the quanity to buy");
		
		Scanner in= new Scanner (System.in);
		a=in.nextInt();
		b=a*100;
		System.out.println("Enter the quanity you buy is" +b);
	    
	    if(b>=1000) {
	      System.out.println("You get a discount of "+(.1*b) +" and your total cost is "+b);
	      System.out.println("Price after discount be" +(b-(.1*b)));
	    }
	    else {
	    	System.out.println("no discout");
	    }
		in.close();
		
		

	}
	
	

}
