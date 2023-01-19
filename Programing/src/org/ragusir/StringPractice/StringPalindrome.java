package org.ragusir.StringPractice;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the word");
		String s=sc.nextLine();
	boolean st=isPalindrome(s);
	if(st)
		System.out.println("yes");
	else
		System.out.println("no");
	}
static boolean isPalindrome(String s) {
	char ch[]=s.toCharArray();
	int m=0,l=ch.length-1;
	while(m<l) {
		if(ch[m]!=ch[l]) 
			return false;
		m++;
		l--;	
		
	}
	return true;
		
	//	System.out.println(s.toLowerCase());;;;
	// 	sc.close();
}
}
