package org.ragusir.programingClass;

import java.util.Scanner;

public class MainPower {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  base number");
	int a=sc.nextInt();
	System.out.println("enter power number");
	int b=sc.nextInt();
	int p=power(a,b);
	System.out.println("please check x^p :"+p);
}
static int power(int x,int y) {
	int mul=1;
	while(y>0) {
		mul=mul*x;
		y--;
	}
		return mul;
}
}
