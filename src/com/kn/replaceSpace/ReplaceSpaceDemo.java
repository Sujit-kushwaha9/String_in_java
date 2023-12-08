package com.kn.replaceSpace;
import java.util.Scanner;

import com.kn.ReverseString.ReverseString;
public class ReplaceSpaceDemo 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
//		taking input form user
		System.out.println("Enter the String");
		String inputString=scan.nextLine();
		
//		creating object to replace space String
		ReverseString reverseString=new ReverseString();
		
//		creating method to replace space String
		String outputString=reverseString.reverseString(inputString);

//		printing replace space String 
		System.out.println("the reversej String is ="+outputString);
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}
}
