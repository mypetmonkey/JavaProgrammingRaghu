package org.ragusir.programingClass;

import java.util.Scanner;

public class SumOfn {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			 sum+=i;
		}
			 System.out.println("sum of first "+n+" natural no is  :"+sum);
		

}
}