package newdope;

import java.util.Scanner;

public class attandance {

	public static void main(String[] args) {
//		A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//		Take following input from user
//		Number of classes held
//		Number of classes attended.
//		And print
//		percentage of class attended
//		Is student is allowed to sit in exam or not.
		
        int class_held,class_attended,class_percentage;
        String a;
		
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Medical case or not ");
//		a=in.nextLine();
//		System.out.println("entered string is" +a);
		
		System.out.println("Enter the number of class held");
		class_held =in.nextInt();
		System.out.println("Enter the number of class attended");
		class_attended=in.nextInt();
		
		
		System.out.println("total class held"  +class_held + "\ntotol class attended" +class_attended);
		class_percentage=(class_attended/class_held)*100;
		
		System.out.println("Medical case or not ");
		
		System.out.println("Medical case or not ");
		a=in.nextLine();
		System.out.println("entered string is" +a);
		
		a=in.nextLine();
		System.out.println("entered string is" +a);
		
		if(class_percentage >= 75) {
			System.out.println("allowed for ecam");
		}
		else if (a.equals("Yes")){
		System.out.println("allowed");
		}
		else {
			System.out.println("NOT ALLOWED");
		}
		in.close();
}
}
