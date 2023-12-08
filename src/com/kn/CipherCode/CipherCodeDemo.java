package com.kn.CipherCode;
import java.util.Scanner;
public class CipherCodeDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		taking string
		System.out.println("Enter the String =");
		String s1=scan.nextLine();
//		taking code
		System.out.println("Enter the code=");
		int num=scan.nextInt();
		
//		create object and calling method
		CipherCode code=new CipherCode();
		code.cipherCodeDemo(s1,num);
		
		scan.close();
	}
}
