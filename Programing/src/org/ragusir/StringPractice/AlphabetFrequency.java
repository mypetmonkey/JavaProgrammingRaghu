package org.ragusir.StringPractice;

import java.util.Scanner;

public class AlphabetFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the sentance");
		String st=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
               count[i]++;
		}
		for(int i=0;i<26;i++) {
			if(count[i]!=0) {
				
			}
		}
	}

}
