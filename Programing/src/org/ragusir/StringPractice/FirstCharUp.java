package org.ragusir.StringPractice;

import java.util.Scanner;

public class FirstCharUp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any sentance");
		String s=sc.nextLine();
		String up=toUpperChar(s);
		System.out.println(up);
	}
static String toUpperChar(String st) {
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1]==' ' ) {
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=((char)(ch[i]-32));
		}
		
		else{
			
		if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
		}
	}
	st=new String(ch);
	return st;

}
}