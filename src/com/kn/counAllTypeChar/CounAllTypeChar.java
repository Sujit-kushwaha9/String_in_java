package com.kn.counAllTypeChar;

public class CounAllTypeChar {

	public void coundAllChar(String st) 
	{
		char[] crr=st.toCharArray();
		int ucvc=0,uccc=0,lcvc=0,lccc=0,digit=0,space=0,special=0;
		for(int i=0;i<crr.length;i++)
		{
			if((int)crr[i]>=65&&(int)crr[i]<=90)
			{
				if(crr[i]=='A'||crr[i]=='E'||crr[i]=='I'||crr[i]=='O'||crr[i]=='U')
				{
					ucvc++;
				}
				else 
				{
					uccc++;
				}
			}
			
			else if((int)crr[i]>=97&&(int)crr[i]<=122)
			{
				if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u')
				{
					lcvc++;
				}
				else 
				{
					lccc++;
				}
			}
			
			else if((int)crr[i]>=48&&(int)crr[i]<=57)
			{
				digit++;
			}
			
			else if((int)crr[i]==32)
			{
				space++;
			}
			
			else 
			{
				special++;
			}
		}
		System.out.println("upper case vowel="+ucvc);
		System.out.println("upper case cons="+uccc);
		System.out.println("lower case vowel="+lcvc);
		System.out.println("lower case cons="+lccc);
		System.out.println("digit is="+digit);
		System.out.println("All space is="+space);
		System.out.println("all Special char is="+special);
	}

}
