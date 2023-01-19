package org.ragusir.programingClass;

import java.util.Scanner;

public class BigDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int big=biggest(n);
		System.out.println("biggest digit in given number is : "+big);
	}
	static int biggest(int x) {
		int big=-9;
		do {
			int r=x%10;
			if(r>big)
				big=r;
			x=x/10;
		}while(x!=0);
		return big;
	}

}
