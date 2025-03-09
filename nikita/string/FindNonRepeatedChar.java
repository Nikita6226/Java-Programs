package com.nikita.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatedChar {

	public static void main(String[] args) {
		// find non repeated character
		String string="swiss";
		Map<Character, Integer> charCount=new LinkedHashMap<Character, Integer>();
		
		for(char c:string.toCharArray())
		{
			charCount.put(c, charCount.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer>entry:charCount.entrySet())
		{
			if (entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
