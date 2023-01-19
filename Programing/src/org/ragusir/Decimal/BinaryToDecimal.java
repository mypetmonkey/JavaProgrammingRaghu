package org.ragusir.Decimal;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bibary number");
		int n=sc.nextInt();
		int sst=binToDec(n);
		System.out.println(sst);
	}
static int binToDec(int bin) {
	int dec=0,pw=1;
	do {
		int r=bin%10;
		dec=dec+r*pw;
		pw=pw*2;
		bin=bin/10;
		
	}while(bin!=0);
	return dec;
}
}
