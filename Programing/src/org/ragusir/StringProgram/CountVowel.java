package org.ragusir.StringProgram;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		int v=0,sd=0,d=0,co=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
			  v++;
			else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				co++;
			else if(ch>='0'&&ch<='9')
				d++;
			else if(ch==' ')
				sp++;
			else 
				sd++;
		}
		System.out.println("no of vowels  "+v);
		System.out.println("no of consonent  "+co);
		System.out.println("no of digits  "+d);
		System.out.println("no of special digit  "+sd);
		System.out.println("no of space  "+sp);
	}

}
