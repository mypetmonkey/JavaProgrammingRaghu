package org.ragusir.programingClass;

import java.util.Scanner;

public class TwoDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if (n<-10&&n>-100||n<100&&n>9)
			System.out.println(n+"  is  two digit");
		else
			System.out.println("no");
	}

}
