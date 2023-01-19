package org.ragusir.programingClass;

import java.util.Scanner;

public class ConcatLoop {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}

}
}