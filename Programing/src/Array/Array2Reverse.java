package Array;

import java.util.Scanner;

public class Array2Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("in reverse order ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]+" ");
		}
	}

}
