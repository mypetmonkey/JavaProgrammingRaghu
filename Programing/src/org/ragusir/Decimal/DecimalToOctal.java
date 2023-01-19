package org.ragusir.Decimal;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String st=decToOctal(n);{
			System.out.println(st);
		}
	}
   static String decToOctal(int dec) {
	   String oct="";
	   do {
		   int r=dec%8;
		   oct=r+oct;
		   dec=dec/8;
	   }while(dec!=0);
	   return oct;
   }
}
