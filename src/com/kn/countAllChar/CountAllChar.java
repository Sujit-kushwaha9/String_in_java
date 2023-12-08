package com.kn.countAllChar;

public class CountAllChar {

	public void countChar(String st) {
		char[] crr = st.toCharArray();

		crr = sortArray(crr);

		System.out.println(crr);

		int count = 1;
		for (int j = 0; j < crr.length - 1; j++) {
			if (j + 1 == crr.length - 1) {
				if (crr[j + 1] == crr[j]) {
					count++;
					System.out.println(crr[j]+" is "+count);
				} else {		
					System.out.println(crr[j + 1] + " is 1");
				}
			}
			if (crr[j] == crr[j + 1]) {
				count++;
			}
			else {
				System.out.println(crr[j] + " is " + count);
				count = 1;
			}
		}
	}
	public char[] sortArray(char[] crr) {
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					char c = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = c;
				}
			}
		}
		return crr;
	}

}
