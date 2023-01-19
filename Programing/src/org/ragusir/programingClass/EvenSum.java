package org.ragusir.programingClass;

import java.util.Scanner;

public class EvenSum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		int n=sc.nextInt();
		int evsum=0, odsum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				evsum=evsum+i;
			}
			else {
	
					odsum=odsum+i;
			}
		}
	 System.out.println("sum of even no is :"+evsum);
	 System.out.println("sum of odd no is :"+odsum);
}
	}