package Array;

import java.util.Scanner;

public class Array3Sum
{
	static int arraySum(int []ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of aray");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" values");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int sm=arraySum(ar);
		System.out.println("sum of all the values is  :"+sm);
		
	}
}
