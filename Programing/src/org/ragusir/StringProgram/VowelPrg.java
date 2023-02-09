package org.ragusir.StringProgram;

import java.util.Scanner;

public class VowelPrg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		st=st.toLowerCase();
		char ch=cntVowel(st);
		System.out.println(ch);
//		int vc=0,oc=0;
//		for(int i=0;i<st.length();i++) {
//			char ch=st.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//				vc++;
//			else
//				oc++;
//		}
//		System.out.println("total vowel "+vc);
//		System.out.println("others "+oc);
		static char cntVowel(String s) {
			for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
			}
		}
		
	}

}
