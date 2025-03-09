package com.nikita.string;

import java.util.HashMap;

public class MaxOccurChar {

	public static void main(String[] args) {
		// Find the maximum occurrence of char in string 
		String string="Programming";
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(char c:string.toCharArray())
		{
			charCount.put(c,charCount.getOrDefault(c, 0)+1);
		}
		char maxChar=string.charAt(0);
		int maxCount=0;
		
		for(char c:charCount.keySet())
		{
			if(charCount.get(c)>maxCount)
			{
				maxCount=charCount.get(c);
				maxChar=c;
			}
		}
		System.out.println(maxChar);
	}

}
