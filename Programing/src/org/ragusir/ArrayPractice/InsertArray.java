package org.ragusir.ArrayPractice;

import java.util.Scanner;

public class InsertArray {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter "+n+" values");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
					
		}
		System.out.println(" which element you want to insert");
		int el=sc.nextInt();
		System.out.println(" where? tell index number.");
		int ins=sc.nextInt();
		int in[]=insert(ar,el,ins);
		System.out.println("insertion completed");
		for(int i=0;i<in.length;i++) { 
			System.out.print(in[i]+" ");
		}

	}

	static int[] insert(int []x,int el,int ind) throws Exception {
		if(ind<0||ind>x.length) {
			System.out.println("be carefull while enter the index no.");
			throw new errorException(" index out of range");
		}
		int []tp=new int[x.length+1];
		tp[ind]=el;
		for(int i=0;i<x.length;i++) {
			if(i<ind)
				tp[i]=x[i];
			else
				tp[i+1]=x[i];
		}
		return tp;
	}

}
class errorException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	errorException(String s){
		super(s);
	}
	
}