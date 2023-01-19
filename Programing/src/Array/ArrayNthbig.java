package Array;

import java.util.Scanner;

public class ArrayNthbig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
	nthBiggest(ar);
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	}
	static int nthBiggest(int ar[],int n) {
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=0;j<ar.length;j++) {
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}
		System.out.println(n+"nth biggest is not there");
		return 0;
	}

}
