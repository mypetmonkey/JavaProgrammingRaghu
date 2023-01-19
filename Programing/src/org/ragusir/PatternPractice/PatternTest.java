package org.ragusir.PatternPractice;

import java.util.Scanner;

public class PatternTest {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=n-1;
			int p=i;
			for(int j=1;j<=i;j++) {
				if(j>1) {
					i=i+k;
					System.out.print(p+" ");
					k--;
				} 
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
       
} 
