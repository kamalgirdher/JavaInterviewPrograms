package basic;

import java.util.Scanner;
import java.lang.Math;

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.print( "Enter Number : ");
		Scanner scanner = new Scanner( System.in);
		int inp =Integer.parseInt(scanner.nextLine());
		scanner.close();
		int	factors=0;
		for (int i=1;i<Math.sqrt(inp);i++) {
			if (inp % i==0) {
				factors=factors+1;
			}
		}
		if (factors==1) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is Not Prime");
		}
			
	}

}
