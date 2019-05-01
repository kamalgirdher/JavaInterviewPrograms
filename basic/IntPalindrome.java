package basic;

import java.util.Scanner;

public class IntPalindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner s = new Scanner(System.in);
		double inp = s.nextDouble();
		s.close();
		
		int l=(int) Math.log10(inp)+1;
		boolean flag=true;
		for (int i=0;i<Math.ceil(l/2.0);i++) {
			if((Math.floor(inp / Math.pow(10,(l-i-1)))%10) !=Math.floor(inp /Math.pow(10,(i))) % 10 ) {
				flag=false;
				break;
			}
		}
		
		if (flag==true){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}