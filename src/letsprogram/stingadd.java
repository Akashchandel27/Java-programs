package letsprogram;

import java.util.Scanner;

public class stingadd {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string s1");
		s1 = in.nextLine();
		System.out.println("enter the string s2");
		s2 = in.nextLine();
		
		System.out.println("after addiation of the two string is " +(s1+s2));
		
		
		in.close();

	}

}
