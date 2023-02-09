package org.ragusir.StringProgram;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		boolean rs=isPalindrome(st);
		if(rs)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	static boolean isPalindrome(String s) {
		char ch[]=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
	  if(ch[i]!=ch[j]) 
		  return false;
		  i++;
		  j--;
	  }
		
	  return true;
		}
	
}
