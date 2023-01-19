package org.ragusir.programingClass;

import java.util.Scanner;

public class DecimalToHexadecimal2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		
		String s="";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};	
    while (n!=0) {
    	int r=n%16;
    	s=hex[r]+s;
    	n=n/16;
    }
    System.out.println(s);
}
}