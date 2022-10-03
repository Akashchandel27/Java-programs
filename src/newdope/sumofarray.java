package newdope;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		
		int a;
		int sum=0;
		Scanner in = new Scanner(System.in);
		int z[] = new int[3];
		
	    for(int i = 0;i<z.length;i++){
	      System.out.println("Print the value of z["+i+"]");
	      z[i] = in.nextInt();
	    }
	    for (int z1:z)
		{ sum=sum+z1;
		}
		System.out.println("Array Element sum is="+sum);
        in.close();
	}

}
