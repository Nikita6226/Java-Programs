package com.nikita.string;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {
		// Find common element in two Arrays
		int[] arr1= {1,5,6,3,9};
		int[] arr2= {3,5,4,2,1};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int num:arr1)
		{
			set.add(num);
		}
		
		for(int num:arr2)
		{
			if(set.contains(num))
			{
				System.out.println(num+" ");
			}
		}

	}

}
