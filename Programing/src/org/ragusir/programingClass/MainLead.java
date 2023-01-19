package org.ragusir.programingClass;

import java.util.Scanner;

public class MainLead {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter three  number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if( a>b&&a<c||a>c&&a<b)
			System.out.println("middle no is  "+a);
		else if(b>a&&b<c||b>c&&b<a)
			System.out.println("middle no is  "+b);
		else
			System.out.println("middle no is  "+c);
		
		
	}
	


}
