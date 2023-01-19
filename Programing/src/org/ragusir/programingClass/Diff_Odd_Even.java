package org.ragusir.programingClass;

import java.util.Scanner;

public class Diff_Odd_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		int rs=diffOddEven(n);
		System.out.println(rs);
	}
   static int diffOddEven(int x) {
	   int evsum=0,odsum=0;
	   do {
		   int r=x%10;
		   
		   if(r%2==0)
			   evsum=evsum+r;
		   else {
			   odsum=odsum+r;
		   }
		   x=x/10;
	   }while(x>0);
	   return (odsum-evsum);
   }
	
}
