package com.nikita.string;

public class VowelsCosonant {

	public static void main(String[] args) {
		String string="Automation";
		int vowels=0,consonants=0;
		for(char c:string.toCharArray())
		{
			if("aeiouAEIOU".indexOf(c)!=-1)
			{
				vowels++;
			}
			else if (Character.isLetter(c)) {
				consonants++;
			}
		}
		System.out.println("Vowels: "+vowels+"\tConsonants: "+consonants);

	}

}
