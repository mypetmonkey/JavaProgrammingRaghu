package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class MainnthBiggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int []ar=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("tell me order");
		int m=sc.nextInt();
		int rs = nthBiggest(ar,m);
		System.out.println(rs);
	}
   static int nthBiggest(int []x,int y) {
	    for(int i=0;i<x.length;i++) {
	    	int count=0;
	    	for(int j=i+1;j<x.length;j++) {
	    		if(x[j]>x[i])
	    			count++;
	    	}
	    	if(count==y-1)
	    		return x[i];
	    }
	    System.out.println(y+" not here");
	    return 0;
   }
}
