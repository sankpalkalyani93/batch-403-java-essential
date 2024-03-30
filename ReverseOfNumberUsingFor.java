package com.loops;

import java.util.Scanner;

public class ReverseOfNumberUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt(); 	//	1234
		int remainder = 0, reversedNum = 0;
		
		for(; num > 0; ) {
			remainder = num % 10; 	// 4, 3, 2, 1
			System.out.println("num : " + num + ", remainder : "+ remainder + ", reversedNum : " + reversedNum);
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;			// 123, 12, 1, 0
		}
		System.out.println("num value : " + num + ", reversed num value : " + reversedNum);
	}

}
