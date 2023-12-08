package com.kn.lowerToUpperUpperToLower;

public class LowerToUpperAndUpperToLower {

	public String lowerUpper(String inputString) {
		char[] crr=inputString.toCharArray();
		StringBuffer s1=new StringBuffer();
		for (int i=0;i<crr.length;i++)
		{
			if((int)crr[i]>=65&&(int)crr[i]<=90)
			{
				crr[i]=(char)((int)crr[i]+32);
			}
			else if((int)crr[i]>=97&&(int)crr[i]<=122)
			{
				crr[i]=(char)((int)crr[i]-32);
			}
			s1=s1.append(crr[i]);
			
		}
		return s1.toString();
	}
	

}
