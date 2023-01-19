package Array;

import java.util.Scanner;

public class Array9Update {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size"); 
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
	 	update(ar);
		System.out.println("after updation of array");
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
			
			static int[] update(int []x) {
				
				for(int i=0;i<x.length;i++) {
					int sum=0,temp=x[i];
					while(x[i]!=0) {
						int r=x[i]%10;
						sum=sum+r;
						x[i]=x[i]/10;
					}
				x[i]=sum+temp;	
				}
				return x;
			}
	
	

}
