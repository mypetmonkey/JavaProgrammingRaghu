package Array;

import java.util.Scanner;

public class Array7Product {
	static int getProduct(int []x) {
		int prod=x[0];
		for(int i=1;i<x.length;i++) {
			prod=prod*x[i];
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int j=0;j<ar.length;j++) {
			ar[j]=sc.nextInt();
		}
		int pd=getProduct(ar);
		System.out.println("product is "+pd);
	}

}
