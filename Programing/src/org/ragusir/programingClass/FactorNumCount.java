package org.ragusir.programingClass;

import java.util.Scanner;

public class FactorNumCount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please boss enter the Number");
		int n=sc.nextInt();
		int sum=n;
		  int count=1;
		  for(int i=1;i<=n/2;i++) {
			  if(n%i==0) 
			  {
				  count++;
			  sum=sum+i;
			  }
		  }
		  System.out.println("factors of given number is  :"+count);
			System.out.println("sum is  :"+sum);  
		  
}
}