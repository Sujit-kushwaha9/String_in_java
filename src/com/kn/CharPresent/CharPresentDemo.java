package com.kn.CharPresent;
import java.util.Scanner;
public class CharPresentDemo
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
//		taking a string from user
		System.out.println("Enter the String= ");
		String s1=scan.nextLine();
		
//		taking a char to check how many time present in String
		System.out.println("Enter the char=");
		char c=scan.next().charAt(0);
		
//		create object
		ChartPresent count=new ChartPresent();
//		calling the method and receive the value
		
		StringBuffer coun=count.countChar(s1,c);
		System.out.println("char present is = "+coun);
		
//		release the source
		scan.close();
	}

}
