package org.ragusir.programingClass;

import java.util.Scanner;

public class SpecialNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two digit number");
		int x=sc.nextInt();
	    int d1=x/10;
	    int d2=x%10;
	    int sum=d1+d2+d1*d2;
	    if (sum==x) {
	    	System.out.println("entered number is special number");
	    }
	    else {
	    	System.out.println("\"entered number is not special number");
	    }
	}

}
