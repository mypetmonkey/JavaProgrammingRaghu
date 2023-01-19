package org.ragusir.programingClass;

import java.util.Scanner;

public class MainDuck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		String n=sc.next();
		isDuck(n);
		sc.close();
	}
	static void isDuck(String x) {
		char ch[]=x.toCharArray();
		if (ch[0]=='0')
System.out.println(" not a duck number");
			else {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='0')
					count++;
			}
			if(count>0)
				System.out.println(" duck number");
			else
				System.out.println("not a duck number");
		}
	}

}
