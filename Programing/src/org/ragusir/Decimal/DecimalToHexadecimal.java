 package org.ragusir.Decimal;

import java.util.Scanner;

public class DecimalToHexadecimal {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	String st=decToHex(n);
	System.out.println(st);
}
 static  String decToHex(int dec) {
	 String hex="";
	 do {
		 int r=dec%16;
		 if(r<10)
			 hex=r+hex;
		 else
			 hex=(char)(r+55)+hex;
		 dec=dec/16;
	 }while(dec!=0);
	 return hex;
	 
 }
}
