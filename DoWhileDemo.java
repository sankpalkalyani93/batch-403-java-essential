package com.loops;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello";
		int i = 11;
		do {
			System.out.println("i : " + i + " : " + message);
			
			i=i+1;
		}while(i <= 10);
		System.out.println("Value of i : " + i);
	}

}
