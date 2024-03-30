package com.loops;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for num1 : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter value for num2 : ");
		int num2 = scan.nextInt();
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}

}
