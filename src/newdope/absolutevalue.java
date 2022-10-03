package newdope;

import java.util.Scanner;

public class absolutevalue {

	public static void main(String[] args) {

//		Write a program to print absolute vlaue of a number entered by user. E.g.-
//		INPUT: 1        OUTPUT: 1
//		INPUT: -1        OUTPUT: 1

		int a;
		System.out.println("Please enter the number");

		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		System.out.println("the number entered is" + a);

		if (a < 0) {
			System.out.println("ouput is" + (a * -1));
		} else {
			System.out.println("output is" + a);
		}

		in.close();

	}

}
