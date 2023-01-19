package org.ragusir.programingClass;

import java.util.Scanner;

public class CircleAreaCircum {

	public static void main(String[] args) {
		
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the radious of circle");
      int r=sc.nextInt();
      double pi=3.14;
      System.out.println("area of circle is: "+pi*(r*r));
      System.out.println("circumference of circle is:  "+2*pi*r);
	
	}

}
