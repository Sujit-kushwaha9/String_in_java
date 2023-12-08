package com.kn.nonRepeatingChar;

public class NonRepeatingChar {

	public void nonRepeatingChar(String st) {

		char[] crr=st.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			int count=1;
			for(int j=0;j<crr.length;j++)
			{
				if(crr[i]==crr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(crr[i+1]+" is first not repeat char");
				break;
			}
		}
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(crr[j]>crr[j+1])
//		{
//		char temp=crr[j];
//		crr[j]=crr[j+1];
//		crr[j+1]=temp;
//	}
		
//		int count=1;
//		for(int i=0;i<crr.length;i++)
//		{
//			if(crr[i]==crr[i+1])
//			{
//				count++;
//			}
//			else
//			{
//				System.out.println(crr[i]+" is")
//			}
//		}
//	}
//
//}
