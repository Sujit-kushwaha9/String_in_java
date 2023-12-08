package com.kn.CharPresent;

public class ChartPresent 
{

	public StringBuffer countChar(String s1,char c) 
	{
		StringBuffer s2=new StringBuffer();
		char[] crr=s1.toCharArray();
		int count=0;
		for (int i=0;i<crr.length;i++)
		{
			if(crr[i]==c)
			{
				count++;
			}
		}
		if(count==1)
		{
			s2.append(c).toString();
		}
		System.out.println(s2);
		return s2;
	}
	
}
