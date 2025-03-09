package com.nikita.string;

public class RemoveWhitespace {

	public static void main(String[] args) {
		//Remove all whitespace from string
		String string="N i k i t a";
		String resultString=string.replaceAll("\\s+", "");
		System.out.println(resultString);

	}

}
