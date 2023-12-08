package com.kn.convetDecimalToRoman;

public class ConvetDecimalToRoman {


	void convetDecimalToRoman(int num) {
		int[] irr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] srr={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuffer s1=new StringBuffer("");
		
		for(int i=0;i<irr.length;i++)
		{
			while(num>=irr[i])
			{
				num=num-irr[i];
				s1=s1.append(srr[i]);
			}
		}
		System.out.println(s1.toString());
	}

}
