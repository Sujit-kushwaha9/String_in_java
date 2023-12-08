package com.kn.anagramString;

public class AnagramString {


	public boolean CheckAnagram(char[] crr1Short, char[] crr2Short) 
	{
		// TODO Auto-generated method stub
		
		boolean is=false;
		if(crr1Short.length==crr2Short.length)
		{
			for(int i=0;i<crr1Short.length;i++) 
			{
				if(crr1Short[i] == crr2Short[i]) 
				{
					is=true;
				}
				else
				{
					is=false;
					break;
				}
			}
		}
		if(is)
		{
			System.out.println("String is Anagram String");
		}
		else
		{
			System.out.println("String is not Anagram String");
		}
	return is;
	}
	
	
}
