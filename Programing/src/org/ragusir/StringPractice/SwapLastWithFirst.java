package org.ragusir.StringPractice;

import java.util.Scanner;

public class SwapLastWithFirst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter any sentance");
		String s=sc.nextLine();
		String st=lastWithFirst(s);
		System.out.println(st);
	}
static String lastWithFirst(String st) {
	char ch[]=st.toCharArray();
	int f=-1 ;
	for(int i=0;i<ch.length;i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ') {
			f=i;
		}
		else {
			if(i==ch.length-1&& ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}
	}
	st=new String(ch);
	return st;
}
}
