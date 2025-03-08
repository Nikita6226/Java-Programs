package com.nikita.string;

public class LargetElement {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6,8};
		int largest=arr[0];
		for(int num:arr)
		{
			if (num>largest) {
				largest=num;
			}
		}
		System.out.println("Larget number: "+largest);
	}

}
