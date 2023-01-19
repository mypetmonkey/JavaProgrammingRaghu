package org.ragusir.programingClass;

import java.util.Scanner;

public class MainPositive {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int x=sc.nextInt();
	if (x<0)
		x=x*-1;
	System.out.println("entered integer is: "+x);

}
}
