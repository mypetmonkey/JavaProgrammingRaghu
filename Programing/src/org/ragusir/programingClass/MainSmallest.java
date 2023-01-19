package org.ragusir.programingClass;

import java.util.Scanner;

public class MainSmallest {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter  three integers value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int small=a;
	if(b<small)
		small=b;
	if(c<small)
		small=c;
	System.out.println("smallest of these three number  is: "+small);
}
}
