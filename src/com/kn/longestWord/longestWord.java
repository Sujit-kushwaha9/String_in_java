package com.kn.longestWord;

public class longestWord {

//	public void longest(String s1) 
//	{
//		int count=0,sum=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			count++;
//			if(s1.charAt(i)==' ')
//			{
//				
//				if(sum<count)
//				{
//					sum=count;
//				}
//				count=0;
//			}
//			
//		}
//		System.out.println(sum);
//	}
	
	public void longest(String s1)
	{
		String[] srr=s1.split(" ");
		
		String temp=new String();
		
		for(String s:srr)
		{
			if(s.length()>temp.length())
			{
				temp=s;
			}
		}
		System.out.println(temp);
	}

}
