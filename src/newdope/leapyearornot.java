package newdope;

import java.util.Scanner;

public class leapyearornot {

	public static void main(String[] args) {
	// Take 10 integer inputs from user and store them in an array and print them on screen.
		
//		Scanner s = new Scanner(System.in);
//		String z[] = new String[3];
//		
//	    for(int i = 0;i<z.length;i++){
//	      System.out.println("Print the value of z["+i+"]");
//	      z[i] = s.nextLine();
//	    }
//	    for(int i = 0;i<z.length;i++){
//	      System.out.println("The value of z["+i+"] is "+z[i]);
		
	int[] a = new int[5];
	
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter values");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter " + i + " value");
		a[i] = s.nextInt();
	}
	for (int a1 : a) {
		System.out.println(a1);
		
		s.close();
	}
}

}



