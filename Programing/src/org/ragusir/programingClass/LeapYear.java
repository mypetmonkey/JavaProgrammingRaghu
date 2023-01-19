package org.ragusir.programingClass;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the year");
	int i=sc.nextInt();
	if(i%400==0||i%4==4&&i%100!=0)
		System.out.println("given year is leap year");
	else
		System.out.println("this is not leap year");
	
	
	
}
}
