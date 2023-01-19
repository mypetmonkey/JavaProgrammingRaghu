 package org.ragusir.StringProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s=sc.nextLine();
		String st="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			st=st+ch;
		}
		System.out.println(st);
	}

}
