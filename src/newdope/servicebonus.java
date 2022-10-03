package newdope;

import java.util.Scanner;

public class servicebonus {

	public static void main(String[] args) {
		
//		A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//		Ask user for their salary and year of service and print the net bonus amount.
       int salary,service;
       
       System.out.println("*********Hello All**** Enter your salary");
       Scanner in = new Scanner(System.in);
       salary = in.nextInt();
       System.out.println("Enter the salary " +salary);
       
       System.out.println("*********Hello All**** Enter your service in year");
       service =in.nextInt();
       System.out.println("Enter the service time " +service);
       
       if (service >= 5) {
    	   System.out.println("the salary of increament after 5 % is " +(0.05*salary));
    	   System.out.println("salary after increament be" +(0.05*salary +salary));
       }
       else {
    	   System.out.println("no increament try again for the other year");
       }
       
       
       in.close();
	}

}
