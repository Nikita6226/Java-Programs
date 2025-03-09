package com.nikita.string;

public class CountCharacter {

	public static void main(String[] args) {
		// Occurrence of character in string
		String string="Nikita";
		char ch='i';
		int count=0;
		
		for(char c:string.toCharArray())
		{
			if (c==ch) {
				count++;
			}			
		}
		System.out.println(count);

	}

}
