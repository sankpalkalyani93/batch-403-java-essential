package com.loops;

import java.util.Scanner;

public class PalindromeOfANumberUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num value : ");
		int num = scan.nextInt();
		int originalNum = num, remainder = 0, reversedNum = 0;
		
		for(; num > 0; ) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}
		
		if(originalNum == reversedNum) {
			System.out.println("Number " + originalNum + " is palindrome");
		}
		else {
			System.out.println("Number " + originalNum + " is NOT palindrome");
		}
	
	}

}
