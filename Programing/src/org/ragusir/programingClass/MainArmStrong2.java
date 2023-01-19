package org.ragusir.programingClass;

import java.util.Scanner;

public class MainArmStrong2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean b=armStrong(n);
		if(b)
			System.out.println("yes "+n+" is armstrong");
		else
			System.out.println("no "+n+" is not armstrong");
	}
	static boolean armStrong(int x) {
	
			int sum=0,t=x;
			int dc=countDigit(x);
			do {
			int r=x%10;
			sum=sum+power(r,dc);
			x=x/10;
			}while(x!=0);
		
		return sum==t;
		
	}
	static int countDigit(int y) {
		int count=0;
		do {
			y=y/10;
			count++;
		}while(y!=0);
		return count;
	}
	static int power(int a,int b) {
		int pow=1;
		while(b>0) {
			pow=pow*a;
		b--;
	}
		return pow;
	}
}
