package com.kn.convetDecimalToRoman;

import java.util.Scanner;

public class ConvetDecimalToRomanDemo {
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
//		taking input from user
		System.out.println("Enter the number to change roman number=");
		int num=scan.nextInt();
		
//		create the object and calling method
		ConvetDecimalToRoman convert=new ConvetDecimalToRoman();
		convert.convetDecimalToRoman(num);
		scan.close();
	}
}
