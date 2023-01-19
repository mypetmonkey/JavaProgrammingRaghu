package Array;

import java.util.Scanner;

public class Array8OdEv { 
	static void OddEven(int []x) {
		int ev=0,od=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0) { 
				ev++;
				}
		else
			od++;		
			}
		System.out.println("numbers of even number="+ev);
		System.out.println("numbers of odd number="+od);
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
		OddEven(ar);
	}

}
