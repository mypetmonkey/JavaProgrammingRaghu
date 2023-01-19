package org.ragusir.StringPractice;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any sentance");
		String st=sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<128;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+"--->"+count[i]);
			
		}
	}
	}
}
