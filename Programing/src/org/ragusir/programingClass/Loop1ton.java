package org.ragusir.programingClass;

import java.util.Scanner;

public class Loop1ton {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range value");
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++) {
			System.out.println(i);
		}*/
		//by using while loop
		int i=1;
		while(i<=n ) {
			System.out.println(i);
		i++;
	}

}
}