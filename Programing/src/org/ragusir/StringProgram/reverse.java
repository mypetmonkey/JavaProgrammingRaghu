package org.ragusir.StringProgram;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the string");
		String st=sc.nextLine();
		String rev=doReverse(st);
		System.out.println(rev);
		sc.close();
	}
	static String doReverse(String s) {
		char ch[]=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		s=new String(ch);
		return s;
	}
	

}
