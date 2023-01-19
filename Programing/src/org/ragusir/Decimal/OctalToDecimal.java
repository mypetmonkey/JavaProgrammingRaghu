package org.ragusir.Decimal;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the octal number");
		int n=sc.nextInt();
		int st=octToDec(n);
		System.out.println(st);
	}
    static int octToDec(int oct) {
    	int dec=0,pw=1;
    	do {
    		int r=oct%10;
    		dec=dec+r*pw;
    		pw=pw*8;
    		oct=oct/10;
          
    	}while(oct!=0);
    	return dec; 
    	
    	
    }
}
