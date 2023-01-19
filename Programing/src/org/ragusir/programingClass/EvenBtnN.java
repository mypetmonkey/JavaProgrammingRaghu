package org.ragusir.programingClass;

import java.util.Scanner;

public class EvenBtnN {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}

}
}