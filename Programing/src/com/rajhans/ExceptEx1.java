package com.rajhans;

import java.util.Scanner;

public class ExceptEx1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("enter the 2nd number");
	
	int b=sc.nextInt();
	try {
	System.out.println(a/b);
	}
catch (ArithmeticException e)
	{
	System.out.println("never divide a number by zero");
}
}

}