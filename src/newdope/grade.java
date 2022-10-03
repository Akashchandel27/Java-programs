package newdope;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
//		A school has following rules for grading system:
//			a. Below 25 - F
//			b. 25 to 45 - E
//			c. 45 to 50 - D
//			d. 50 to 60 - C
//			e. 60 to 80 - B
//			f. Above 80 - A
//			Ask user to enter marks and print the corresponding grade.
		
	int a;
	   System.out.println("Enter your marks");
	   Scanner in = new Scanner(System.in);
	   a=in.nextInt();
	   System.out.println("Your marks is " +a);
	   
	   if(a>=80) {
		   System.out.println("A Grade");
	   }
	   else if(a<80 && a>=60) {
		   System.out.println("B grade");
	   }
	   else if(a<59 && a<=34) {
		   System.out.println("C grade");
	   }
		   else {
			   System.out.println("e ");
		   }
	   
	   in.close();


	}

}
