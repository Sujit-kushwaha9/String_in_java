package com.kn.reverseWord;

public class ReverseWord {

	public void reverseWord(String inputString) 
	{
		String[] srr=inputString.split(" ");

		for(int i=0;i<srr.length;i++)
		{
			char[] crr=srr[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--)
			{
				System.out.print(crr[j]);
			}
			System.out.print(" ");
		}
	}

}
