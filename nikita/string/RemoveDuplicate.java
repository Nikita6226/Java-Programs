package com.nikita.string;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,2,4,4,3,3};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		System.out.println(set);
	}

}
