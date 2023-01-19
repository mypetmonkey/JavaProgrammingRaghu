package org.ragusir.PatternPractice;

import java.util.Scanner;

public class PatterByVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		 for(int i=5;i>=1;i--)
		 {
			 for(int j=i;j<=n-1;j++) {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
