package com.kn.printUniqueChar;

public class UniqueChar 
{

	public void countChar(String s1) 
	{
		char[] crr=s1.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			StringBuffer s2=new StringBuffer("");
			int count=0;
			for(int j=0;j<crr.length;j++)
			{
				if(crr[i]==crr[j])
				{
					count++;
					s2.append(crr[i]);
				}
			}
			if(count==1)
			{
				System.out.print(s2);
				System.out.println(" is unique char");
			}
		}
		
	}

}
