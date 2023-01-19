package org.ragusir.programingClass;

import java.util.Scanner;

public class SmallDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int small=smallest(n);
		System.out.println("smallest digit in given number is : "+small);
	}
	static int smallest(int x) {
		int small=9;
		do {
			int r=x%10;
			if(r<small)
				small=r;
			x=x/10;
		}while(x!=0);
		return small;
	}

}


