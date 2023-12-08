package com.kn.ReverseString;
import java.util.Scanner;
public class ReverseStringDemo 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
//		taking input form user
		System.out.println("Enter the String");
		String inputString=scan.nextLine();
		
//		creating object to reverse String
		ReverseString reverseString=new ReverseString();
		
//		creating method to reverse String
		String outputString=reverseString.reverseString(inputString);

//		printing reverse String 
		System.out.println("the reversej String is ="+outputString);
		
		
		
		scan.close();
	}
}
