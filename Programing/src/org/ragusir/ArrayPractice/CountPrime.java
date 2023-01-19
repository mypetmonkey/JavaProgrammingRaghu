package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class CountPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int cnt=getPrime(ar);
		System.out.println(cnt);
	}
static int getPrime(int []x) {
	int count=0;
	
	for(int i=0;i<x.length;i++) {
		int y=x[i];
		boolean b=isPrime(y);
		if(b)
			count++;
	}
	return count;
}
static boolean isPrime(int y) {
	for(int i=2;i<y/2;i++) {
		if(y%i==0)
			return false;
	}
	
		return true;
}
}
