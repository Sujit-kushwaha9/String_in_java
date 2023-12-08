package com.kn.PalindromString;

public class PalindromString 
{
	public String palindromStinr(String inputString)
	{
		StringBuffer outputString=new StringBuffer();
		
		for(int i=inputString.length()-1;i>=0;i--)
		{
			outputString=outputString.append(inputString.charAt(i));
		}
		
		return outputString.toString();
	}
}
