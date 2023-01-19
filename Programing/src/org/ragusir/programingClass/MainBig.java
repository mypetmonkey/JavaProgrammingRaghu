package org.ragusir.programingClass;

import java.util.Scanner;

public class MainBig {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  three integers value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if(b>big) 
			big=b;
			if(c>big) 
				big=c;
			
		
		System.out.println("biggest of these three num is: "+big);
	}

}
