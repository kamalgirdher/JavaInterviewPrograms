package basic;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter string :");
		Scanner scanner = new Scanner(System.in);
		String inp = scanner.nextLine();
		
		scanner.close();
		int l = inp.length();

		boolean flag=true;
		for(int i=0;i<Math.ceil(l/2.0);i++) {
			
			if (inp.charAt(i)!=inp.charAt(l-i-1)) {
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
