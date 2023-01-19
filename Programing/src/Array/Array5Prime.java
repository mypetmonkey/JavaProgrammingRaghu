package Array;

import java.util.Scanner;

public class Array5Prime
{
	static int getPrime(int[] x) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			
			int y=x[i];
			boolean b=prime(y);
			if(b==true)
			count++;
			}
		return count;	
	}
	static boolean prime(int y)
	{
		for(int i=2;i<y;i++)
		{
			if(y%i==0)
			return false;
			}
		
		return true;
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
		int cnt=getPrime(ar);
		System.out.println("total prime no. are  "+cnt);
	}
}
