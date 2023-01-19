package org.ragusir.programingClass;

import java.util.Scanner;

public class FactorNumberCountByMethod {
	static void factCount(int x) {
		int count=1;
		for(int i=1;i<=x/2;i++) {
		if(x%i==0)
			count++;
	}
		System.out.println("factors of the given number is :"+count);

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number please");
		int n=sc.nextInt();
		factCount(n);
	}
}