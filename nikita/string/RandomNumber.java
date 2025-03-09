package com.nikita.string;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// Generate random number
		Random random=new Random();
		for(int i=0; i<5;i++)
		{
			System.out.println(random.nextInt(100));
			//Random number between 0 to 99
		}

	}

}
