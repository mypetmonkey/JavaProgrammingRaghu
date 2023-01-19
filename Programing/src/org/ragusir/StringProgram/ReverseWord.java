package org.ragusir.StringProgram;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String st[]=s.split(" ");
	String str=" ";
	
	for(int i=0;i<st.length;i++) {
		for(int j=0;j<st[i].length();j++) {
			char ch=st[i].charAt(j);
			str=ch+str;
		}
		str=str+" ";
	}
	System.out.println("reverse is  "+str);
	}

}
