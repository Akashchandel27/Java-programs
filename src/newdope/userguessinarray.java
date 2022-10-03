package newdope;

import java.util.Scanner;

public class userguessinarray {

	public static void main(String[] args) {
		// Take 10 integer inputs from user and store them in an array.
		//Again ask user to give a number.
		//Now, tell user whether that number is present in array or not.
		
		Scanner in = new Scanner(System.in);
		int z[] = new int[3];
		
	    for(int i = 0;i<z.length;i++){
	      System.out.println("Print the value of z["+i+"]");
	      z[i] = in.nextInt();
	    }
	     System.out.println("Enter user to give a number");
	     int a =in.nextInt();
	     
	     int index= -1;
	     
//	        System.out.print("A number to find: ");
//	        int number = in.nextInt();
	        for (int i = 0; i < z.length; i++) {
	            if (z[i] == index) {
	                index = i;
	                System.out.println("present");
	                break;
	           
	     }
	     else {
	    	 System.out.println("number is not present");
	     }
//	    for(int i = 0;i<z.length;i++){
//	      System.out.println("The value of z["+i+"] is "+z[i]);
          in.close();
	}

}
}
