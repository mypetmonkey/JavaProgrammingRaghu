package org.ragusir.programingClass;

import java.util.Scanner;

public class MainPrime2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number yaar");
		int n=sc.nextInt();
		
		
		for(int i=2;i<=n/2;i++) 
		
		{	if(n%i==0) {
				System.out.println("not prime");
		}
			else {
				System.out.println("yes prime");
			}
		}	
	}
}