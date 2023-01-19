package Array;

import java.util.Scanner;

public class Array6Small
{
	static int getSmallest(int []x) {
		
		int small=x[0];
		for(int i=1;i<x.length;i++) {
			if( x[i]<small)
				small=x[i];
		}
		return small;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int small=getSmallest(ar);
		System.out.println("smallest is  "+small);
	}

}
