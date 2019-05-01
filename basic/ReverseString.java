package basic;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		System. out. print( "Enter a string : ");
		Scanner scanner = new Scanner( System. in);
		String[] inp = scanner. nextLine().split("");
		scanner.close();
		for(int i=inp.length-1;i>=0;i--) {
			System.out.print(inp[i]);
		}
	}

}
