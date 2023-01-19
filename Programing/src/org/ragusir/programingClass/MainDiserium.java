package org.ragusir.programingClass;

import java.util.Scanner;

public class MainDiserium {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isDiserium(n);
		if(rs)
			System.out.println(n+" is diserium");
		else
			System.out.println(n+" is not diserium");
	}
   static boolean isDiserium(int x) {
	   int dc=countdigit(x);
	   int sum=0,temp=x;
	   do {
		   int r=x%10;
		   sum=sum+power(r,dc);
		   dc--;
		  x=x/10; 
	   }while(x!=0);
	   return sum==temp;
   }
   static int countdigit(int a) {
	   int cnt=0;
	   do {
		  a=a/10;
		  cnt++;
	   }while(a!=0);
	   return cnt;
   }
   static int power(int a,int b) {
	   int pow=1;
	   while(b>0) {
		   pow=pow*a;
	   b--;
	   }
	   return pow;
   }
   
}
