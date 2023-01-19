package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st array size");
		int n=sc.nextInt();
		int ar1[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("enter 2nd array size");
		int o=sc.nextInt();
		int ar2[]=new int[o];
		System.out.println("enter "+o+" values");
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		int sor[]=sorted(ar1,ar2);
		System.out.println("after sorting");
		{
			for(int i=0;i<sor.length;i++)
				System.out.print(sor[i]+" ");
		}
		
	}
	static int[] sorted(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
			c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length){
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
		return c;
	}

}
