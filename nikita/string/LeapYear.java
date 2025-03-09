package com.nikita.string;

public class LeapYear {

	public static void main(String[] args) {
		// check if the year is leap 
		int year=2024;
		boolean isLeap=(year%4==0 && year%100!=0)||(year%400==0);
		System.out.println(isLeap);
	}

}
