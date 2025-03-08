package com.nikita.string;

public class ReverseString {

	public static void main(String[] args) {
		String string="Automation";
		StringBuilder reveseBuilder=new StringBuilder(string);
		reveseBuilder.reverse();
		System.out.println(reveseBuilder);

	}

}
