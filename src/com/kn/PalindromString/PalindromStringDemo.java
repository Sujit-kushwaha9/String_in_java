package com.kn.PalindromString;

import java.util.Scanner;

public class PalindromStringDemo 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
//		taking input form user
		System.out.println("Enter the String");
		String inputString=scan.nextLine();
		
//		creating object to Palindrom String class
		PalindromString palindromString=new PalindromString();
		
//		creating method to Palindrom String
		String outputString=palindromString.palindromStinr(inputString);

//		printing Palindrom String or not 
		if(inputString.equals(outputString))
		{
			System.out.println("the String is palindrom");
		}
		else
		{
			System.out.println("the String is not palindrom");
		}
		
		scan.close();
	}
}
