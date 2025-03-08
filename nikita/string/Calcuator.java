package com.nikita.string;

import java.util.Scanner;

public class Calcuator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first num: ");
		double num1=scanner.nextDouble();
		
		System.out.println("Enter second num: ");
		double num2=scanner.nextDouble();
		
		System.out.println("Enter Operation(+,-,*,/: )");
		char operation=scanner.next().charAt(0);
		double result;
		
		switch(operation)
		{
			case '+':
				System.out.println(result=num1+num2);
				break;
			case '-':
				System.out.println(result= num1-num2);
				break;
			case '*':
				System.out.println(result=num1*num2);
				break;
			case '/':
				System.out.println(result=num1/num2);
				break;
				
			default:throw new IllegalArgumentException("Invalid operaton!!");
		}
//		System.out.println("Result: "+result);

	}

}
