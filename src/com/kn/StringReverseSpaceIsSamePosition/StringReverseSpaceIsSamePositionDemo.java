package com.kn.StringReverseSpaceIsSamePosition;

public class StringReverseSpaceIsSamePositionDemo 
{
	public static void main(String[] args) {
		String st="I am Learning Java";
		char[] crr=st.toCharArray();
		char[] arr=new char[crr.length];
		System.out.println(crr);
		
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==' ')
			{
				arr[i]=crr[i];
			}
		}
		
		int j=crr.length-1;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]!=' ')
			{
				if(arr[j]==' ')
				{
					j--;
				}
				arr[j]=crr[i];
				j--;
			}
		}
		System.out.println(arr);
	}
}
