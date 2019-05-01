package basic;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		System. out. print( "Enter the limit : ");
		Scanner scanner = new Scanner( System. in);
		int inp =Integer.parseInt(scanner.nextLine());
		scanner.close();
		int a=0;
		int b=1;
		int temp;
		System.out.print(a + " ");
		System.out.print(b + " ");
		while(a+b<=inp) {
			System.out.print(a+b + " ");
			temp=a+b;
			a=b;
			b=temp;
					
		}
	}

}
