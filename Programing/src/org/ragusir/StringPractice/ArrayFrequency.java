package org.ragusir.StringPractice;

import java.util.Scanner;

public class ArrayFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" value");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
			for(int i=0;i<ar.length;i++) {
				int count=0;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j])
					count++;
				}
				System.out.println(i+"--"+count);
			}
			
	
	}

}
