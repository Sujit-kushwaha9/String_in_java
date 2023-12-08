package com.kn.CipherCode;

public class CipherCode {

	public void cipherCodeDemo(String s1,int num) {

//		converted string to array
		char[] crr=s1.toCharArray();
		
//		use for loop to add the code
		num=num%26;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=65&&crr[i]<=90)
			{
				if(crr[i]+num>90)
				{
					crr[i]=(char)(crr[i]+num-26);
				}
				else
				{
					crr[i]=(char)(crr[i]+num);
				}
			}
			else if(crr[i]>=97&&crr[i]<=122)
			{
				if(crr[i]+num>122)
				{
					crr[i]=(char)(crr[i]+num-26);
				}
				else
				{
					crr[i]=(char)(crr[i]+num);
				}
			}
		}
		
//		for(int i=0;i<)
		
		System.out.println(crr);
		
		
//		converted array to string
		String s2=new String(crr);
		
		
		System.out.println();
//		print the string
		System.out.println(s2);
	}

}
