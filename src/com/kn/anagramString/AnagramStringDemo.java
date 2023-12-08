package com.kn.anagramString;
import java.util.Scanner;
public class AnagramStringDemo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
//		taking String 
		System.out.println("Enter first String=");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
//		converting char array
		char[] crr1=s1.toCharArray();
		char[] crr2=s2.toCharArray();
		
//		Shorting method calling and get short array
		char[] crr1Short=charShortArray(crr1);
		char[] crr2Short=charShortArray(crr2);
		
//		creating object and calling method
		AnagramString anagram=new AnagramString();
		boolean is=anagram.CheckAnagram(crr1Short,crr2Short);
		
		if(is)
		{
			
			System.out.println("String is Anagram String");
		}
		else
		{
			System.out.println("String is not Anagram String");
		}
		scan.close();
	}
				
		

	private static char[] charShortArray(char[] crr) 
	{

//		method to srot specifyed character array
//		shorting the array
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr.length-1-i;j++)
			{
				if(crr[j]>crr[j+1])
				{
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
				}
			}
		}
//		shorted array print
		System.out.println(crr);
		
//		return shorting array
		return crr;
	}

	
}
