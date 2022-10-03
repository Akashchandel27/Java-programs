package newdope;

import java.util.Scanner;

public class oldest {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the age of person A,B,C");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a");
		}
		else if(b>c && b>a){
		System.out.println("b");
		}
		else
			System.out.println("c");
		
		
		System.out.println("Enter the age for A" +(Math.max(a, b)));
		
		in.close();
		

	}

}
