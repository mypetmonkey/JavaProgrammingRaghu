package org.ragusir.programingClass;

import java.util.Scanner;

public class FactorialByMethod {
	static void factorial(int x) {
		int mul=1;
		for(int i=1;i<=x;i++) {
			mul=mul*i;
		}
			System.out.println("factroial of the number is   "+mul);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number please");
		int n=sc.nextInt();
		factorial(n);
		
	}
	
	

}
