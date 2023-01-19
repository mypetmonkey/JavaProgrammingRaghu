package Array;

import java.util.Scanner;

public class Array4Big
{
	static int getBiggest(int[]x) {
		int big=x[0];
		for(int i=1;i<x.length;i++) {
			if(x[i]>big)
				big=x[i];
		}
		return big;
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
	   int bigest=getBiggest(ar);
			   System.out.println("biggest is  "+bigest);
	   
	}

}
