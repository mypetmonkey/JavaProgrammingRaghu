package org.ragusir.ArrayPractice;

import java.util.HashSet;
import java.util.Scanner;


public class RemoveDulpicate {
//	public static void main(String[] args) {
//		int ar[]= {4,1,2,3,5,7,5,9,8,4,3,2,6};
//		HashSet<Integer> s=new HashSet<Integer>();
//		for(int i=0;i<ar.length;i++) {
//			s.add(ar[i]);
//		}
//		for(int p:s) {
//			System.out.print(p+" ");
//		}
//	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println(" enter "+n+" values");
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println(" element after removing duplicate");
	removeDuplicate(ar);
	}
static void removeDuplicate(int[] arr) {
	HashSet<Integer> h=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		 h.add(arr[i]);
	}
	for(Integer p:h) {
		System.out.print(p+" ");
	}
}


	  
}
