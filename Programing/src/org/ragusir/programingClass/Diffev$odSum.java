package org.ragusir.programingClass;

import java.util.Scanner;

public class Diffev$odSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int dif=diffEvOd(n);
		System.out.println("difference  "+dif);
	}
	static int diffEvOd(int x) {
		int evsum=0,odsum=0;
		do {
			int r=x%10;
			if(r%2==0)
				evsum=evsum+r;
			else
				odsum=odsum+r;
			x=x/10;
		}while(x>0);
		return (odsum-evsum);
		
	}

}
