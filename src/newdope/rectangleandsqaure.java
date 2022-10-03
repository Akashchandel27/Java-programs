package newdope;

import java.util.Scanner;

public class rectangleandsqaure {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length");
	    int x= in.nextInt();
	    
	    System.out.println("Enter Breadth");
	    int y= in.nextInt();
	    
	    if(x==y) {
	    	System.out.println("sqaure");
	    }
	    else {
	    	System.out.println("Rectangle");
	    }
	}

}
