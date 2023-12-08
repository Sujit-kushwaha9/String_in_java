package com.kn.countAllChar;
import java.util.Scanner;
public class CountAllCharDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		taking input from the user
		System.out.println("Enter the String=");
		String st=scan.nextLine();
		
//		create the class object
		CountAllChar count=new CountAllChar();
		count.countChar(st);
		
		
		scan.close();
	}
}
