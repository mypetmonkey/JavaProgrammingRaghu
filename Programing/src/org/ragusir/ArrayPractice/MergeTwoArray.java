package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st array size");
		int m=sc.nextInt();
		int ar[]=new int[m];
		System.out.println("enter "+m+" values");
		for(int i=0;i<m;i++) {
		ar[i]=sc.nextInt();	
		}
		System.out.println("enter 2nd array size");
		int n=sc.nextInt();
		int ar2[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<n;i++) {
			ar2[i]=sc.nextInt();
		}
		int[] rs=merge(ar,ar2);{
			for(int i=0;i<rs.length;i++) {
				System.out.print(rs[i]+" ");
			}
		}
	}
	static int[] merge(int []x,int y[]) {
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			z[x.length+i]=y[i];
		}
		return z;
	}

}
