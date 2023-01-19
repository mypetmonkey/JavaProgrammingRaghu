package Array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) 
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter  "+n+"   values");
		for(int i=0;i<ar.length;i++) {
			ar [i]=sc.nextInt();
		}
		System.out.println("user entered array");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
