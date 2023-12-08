package com.kn.firstletterchange;

public class FristLetterChange {

	public String fristLetter(String inputString) 
	{
		char[] crr=inputString.toCharArray();
		StringBuffer s1=new StringBuffer();
		for (int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr.length;j++)
			{
				if(j==0)
				{
					if((int)crr[0]>=65&&(int)crr[0]<=90)
					{
						crr[0]=(char)((int)crr[0]+32);
					}
				}
				s1=s1.append(crr[j]);
			}
				
		}
		return s1.toString();
	}

}
