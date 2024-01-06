 package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class ArrayFrequency {
	public static void main(String[] args) {
		int ar[]= {12,32,34,32,12,12,-23,55,34};
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(b[i]==false) {
				int count =1;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						count++;
					b[j]=true;
				}
			}
		
	System.out.println(ar[i]+"===>"+count);
	}
	}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of array");
//		int n=sc.nextInt();
//		int ar[]=new int[n];
//		System.out.println("enter "+n+" values");
//		for(int i=0;i<ar.length;i++) {
//			ar[i]=sc.nextInt();
//		}
//		System.out.println(" frequencyy of given array element is: ");
//		arrayFreq(ar);
//		}
//	static void arrayFreq(int x[]) {
//		boolean b[]=new boolean[x.length];
//		for(int i=0;i<x.length;i++) {
//			if(b[i]==false) {
//				int count=1;
//				for(int j=i+1;j<x.length;j++) {
//					if(x[i]==x[j]) {
//						count++;
//						b[j]=true;
//					}
//				}
//			System.out.println(x[i]+"=>>>>"+count);
//		}
//	}
		}
}