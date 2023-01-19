package org.ragusir.programingClass;

import java.util.Scanner;

public class AvgOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the number");
		int n=sc.nextInt();
		double avg=avgOfDigits(n);
		System.out.println("average of digit is "+avg);
	}
	static double avgOfDigits(int x) {
		double sum=0;
		int count=0;
		do {
			int r=x%10;
			sum=sum+r;
			x=x/10;
			count++;
		}
		while(x!=0);
		return sum/count;
	}

}
