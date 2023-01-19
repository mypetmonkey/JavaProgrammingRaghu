package org.ragusir.programingClass;

import java.util.Scanner;

public class MainsumBigSml {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int big=0,small=0;
			int r=n%i;
			if (r==1)
				small=small+r;
			if(r==4)
				big=big+r;
		}
		System.out.println("sum"+(big+small));
	}

}
