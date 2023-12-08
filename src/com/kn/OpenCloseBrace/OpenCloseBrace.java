package com.kn.OpenCloseBrace;

public class OpenCloseBrace {

	public void checkOpenCloseBrace(String s1) {
		
//		convert to the string to char array
		char[] crr=s1.toCharArray();
		
		int paranthesis=0,curly=0,square=0;
		
//		using for loop to check the braces
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]=='(')
			{
				paranthesis++;
			}
			else if(crr[i]==')')
			{
				paranthesis--;
			}
			else if(crr[i]=='{')
			{
				curly++;
			}
			else if(crr[i]=='}')
			{
				curly--;
			}
			else if(crr[i]=='[')
			{
				square++;
			}
			else if(crr[i]==']')
			{
				square--;
			}
		}
//		checking the String is valid or not
		if(paranthesis==0&&curly==0&&square==0)
		{
			System.out.println("Govern String is valid String");
		}
		else
		{
			System.out.println("Given String is not valid String");
		}
	}

}
