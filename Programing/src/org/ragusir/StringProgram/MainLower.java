package org.ragusir.StringProgram;

import java.util.Scanner;


public class MainLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
				st=new String(ch);
		}
		System.out.println(st);
		sc.close();
	}

}
