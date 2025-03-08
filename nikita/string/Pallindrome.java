package com.nikita.string;

public class Pallindrome {

	public static void main(String[] args) {
		String string="level";
		StringBuilder revString=new StringBuilder(string).reverse();
		
		//Compare original string with reverse
		if (string.equals(revString.toString())) {
			System.out.println("String is Pallindrome!!");
		}
		else {
			System.out.println("String is NOT Pallindrome!!");
		}

	}

}
