package org.ragusir.programingClass;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter oo number");
		int n=sc.nextInt();
		int cnt=countDigit(n);
		System.out.println(cnt);
	}
	static int countDigit(int n) {
	      int count=0;
	      do {
	    	  n=n/10;
	    	  count++;
	      }while(n!=0);
	     return count;
	}
}