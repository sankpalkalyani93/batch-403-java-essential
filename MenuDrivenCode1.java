package com.loops;

import java.util.Scanner;

public class MenuDrivenCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice = 0, num1, num2, result = 0;
		
		do {
			System.out.println(" ***** MENU ***** ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("Enter choice : ");
			choice = scan.nextInt();
			
			switch(choice) {
				
				case 1:
					System.out.println("Enter num1 value : ");
					num1 = scan.nextInt();
					System.out.println("Enter num2 value : ");
					num2 = scan.nextInt();
					result = num1 + num2;
					System.out.println("Addition : " + result);
					break;
					
				case 2:
					System.out.println("Enter num1 value : ");
					num1 = scan.nextInt();
					System.out.println("Enter num2 value : ");
					num2 = scan.nextInt();
					result = num1 - num2;
					System.out.println("Subtraction : " + result);
					break;
					
				case 3:
					System.out.println("Enter num1 value : ");
					num1 = scan.nextInt();
					System.out.println("Enter num2 value : ");
					num2 = scan.nextInt();
					result = num1 * num2;
					System.out.println("Multiplication : " + result);
					break;
					
				case 4:
					System.out.println("Enter num1 value : ");
					num1 = scan.nextInt();
					System.out.println("Enter num2 value : ");
					num2 = scan.nextInt();
					result = num1 / num2;
					System.out.println("Division : " + result);
					break;
					
				case 5:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice");
			}	
		}while(choice != 5);
	}

}
