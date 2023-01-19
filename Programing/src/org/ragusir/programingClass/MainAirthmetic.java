package org.ragusir.programingClass;

import java.util.Scanner;

public class MainAirthmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Sum of number is  :"+(x+y));
		System.out.println("diffrence is:  "+(x-y));
		System.out.println("product is:  "+x*y);
		System.out.println("quotient is:  "+x/y);
		System.out.println("reminder is:  "+x%y);
	}

}
