package com.nikita.string;

import java.util.Scanner;

public class SimpleLogin {

	public static void main(String[] args) {
		// Implementation of simple login system
		String username="root";
		String password="Pass23";
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String inputUsername=scanner.nextLine();
		
		System.out.println("Enter password: ");
		String inputPassword=scanner.nextLine();
		
		if(username.equals(inputUsername)&&password.equals(inputPassword))
			System.out.println("Login successful!!");
		else
			System.out.println("Login fail!!");

	}

}
