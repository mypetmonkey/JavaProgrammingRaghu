package org.ragusir.programingClass;

import java.util.Scanner;

public class RectangleAePer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breath of rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("area of rectangle is :"+l*b);
		System.out.println("peremeter of rectangle is:  "+2*(l+b));
	
	}

}
