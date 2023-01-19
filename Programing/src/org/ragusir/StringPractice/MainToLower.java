package org.ragusir.StringPractice;

import java.util.Scanner;

public class MainToLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter ant sentance");
		String s=sc.nextLine();
		String st=conToLower(s);
		System.out.println(st);
	}
static String conToLower(String s) {
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(ch[i]>='A' && ch[i]<='Z') {
			ch[i]=(char)(ch[i]+32);
		}
	}
	s=new String(ch);
	return s;
}
}
