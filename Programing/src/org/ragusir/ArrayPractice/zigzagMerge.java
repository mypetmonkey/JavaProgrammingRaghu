package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class zigzagMerge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array");
		int m=sc.nextInt();
		int ar1[]=new int[m];
		System.out.println("enter "+m+" values");
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of second array");
		int n=sc.nextInt();
		int ar2[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=sc.nextInt();
		}
		int  mer[]=merge(ar1,ar2);
		for(int i=0;i<mer.length;i++) {
			System.out.print(mer[i]+" ");
		}
	}
	static int[] merge(int []x,int []y) {
		int[]z=new int[x.length+y.length];
		int i=0,k=0;
		while(i<x.length && i<y.length) {
			z[k]=x[i];
			k++;
			z[k]=y[i];
			i++;
			k++;
		}
		while(i<x.length) {
			z[k]=x[i];
			k++;
			i++;
			
		}
		while(i<y.length) {
			z[k]=y[i];
			k++;
			i++;
			
		}
		return z;
	}

}
