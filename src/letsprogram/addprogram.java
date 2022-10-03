package letsprogram;

import java.util.Scanner;

public class addprogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		System.out.println("Enter third number");
		int c = s.nextInt();
		System.out.println("All are equal : " + (a == b && b == c && c == a));
		System.out.println("Any two are equal : " + (a == b || b == c || c == a));
		
		s.close();

	}

}
