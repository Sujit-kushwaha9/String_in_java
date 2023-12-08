package com.kn.OpenCloseBrace;
import java.util.Scanner;
public class OpenCloseBraceDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		taking the input from user 
		System.out.print("Enter the all type brac4ket=");
		String s1=scan.nextLine();
		
//		create the class and call the method to check 
		OpenCloseBrace check=new OpenCloseBrace();
		check.checkOpenCloseBrace(s1);
		scan.close();
	}
}
