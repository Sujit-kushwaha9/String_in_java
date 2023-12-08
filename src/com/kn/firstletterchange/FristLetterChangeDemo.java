package com.kn.firstletterchange;

public class FristLetterChangeDemo {
	public static void main(String[] args) {
		String inputString="i am learning java";
		
		FristLetterChange letter=new FristLetterChange();
		String outputString=letter.fristLetter(inputString);
		System.out.println(outputString);
	}
}
