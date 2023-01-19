package org.ragusir.programingClass;

import java.util.Scanner;

public class ReturnPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	int count=0;
	for(int i=2;i<=n;i++) {
		boolean rs=isPrime(i);
		if(rs==true)
			count++;
	}
	System.out.println("total prime number within 1 to "+n+" is "+count);
	System.out.println("those numbers are");
	for(int j=1;j<=n;j++) {
		boolean b=isPrime(j);
		if(b)
		System.out.print(j+" ");
	}
	
}
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
				return true;
		
	}
}
