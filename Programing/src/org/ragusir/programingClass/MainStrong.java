 package org.ragusir.programingClass;

import java.util.Scanner;

public class MainStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isStrong(n);
		if(rs==true)
			System.out.println("yes strong");
		else 
			System.out.println("not strong");
	}
	
	static boolean isStrong(int x) {
		int sum=0,temp=x;
		do {
			int r=x%10;
			sum=sum+fact(r);
			x=x/10;
		}while (x!=0);
		return sum==temp;
	}
	static int fact(int n) {
		int f=1;
		for(int i=n;i>0;i--) {
			f=f*i;
		}
		return f;
	}
	
}
