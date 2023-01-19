package org.ragusir.StringPractice;

import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String st=sc.nextLine();
		st=st.toLowerCase();
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)!=' ')
				count++;
		}
		System.out.println("total characters are :"+count);
	}

}
