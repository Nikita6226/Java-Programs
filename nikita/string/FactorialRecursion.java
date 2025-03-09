package com.nikita.string;

public class FactorialRecursion {

	public static void main(String[] args) {
		// Find the factorial of number using Recursion
		int num=5;
		System.out.println(factorial(num));

	}

	private static int factorial(int num) {
		if(num==0)
			return 1;
		return num*factorial(num-1);
	}
	

}
