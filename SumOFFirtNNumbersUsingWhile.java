package com.loops;

import java.util.Scanner;

public class SumOFFirtNNumbersUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n = scan.nextInt();
		
		int sum = 0, i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("summation of first-n " + n + " is : " + sum);
	}

}
