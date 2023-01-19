package com.rajhans;

import java.util.Scanner;

public class Exception7 {
	public static void main(String[] args) {
		try {
			System.out.println("enter the first number");
			Scanner sc=new Scanner(System.in);
					int num1=sc.nextInt();
					System.out.println("enter the second number");
					int num2=sc.nextInt();
					int c=num1/num2;
					System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		catch(Exception e) {
			System.out.println("handled boss");
		}
		finally
		{
			System.out.println("dont worry ");
			System.out.println("okey");
		}
	}

}
