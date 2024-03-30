package com.loops;

import java.util.Scanner;

public class FactorialOfANumberUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for num : ");
		int num = scan.nextInt();
		
		int i = num, fact = 1;
		while(i > 0) {
			fact = fact * i;
			i--;
		}
		System.out.println("Factorial of num " + num + " is : " + fact);
	}

}
