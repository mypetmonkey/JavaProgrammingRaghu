package Array;

import java.util.Scanner;

public class Array8eo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
	    int n=sc.nextInt();
	    int ar[]=new int[n];
	    System.out.println("enter "+n+" values");
	    for(int i=0;i<ar.length;i++) {
	    	ar[i]=sc.nextInt();
	    	
	    }
	    	int cnt[]=countevod(ar);
	    			System.out.println("even  "+cnt[0]);
	    	System.out.println("odd  "+cnt[1]);
	    
	}
	static int[] countevod(int []x) {
		int ev=0,od=0;
		for(int i=0;i<x.length;i++) {
		if(x[i]%2==0)
			ev++;
		else
			od++;
	}
		int count[]={ev,od};
		return count;
	}
	

}
