package org.ragusir.programingClass;

import java.util.Scanner;

public class MainOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int n=sc.nextInt();
		String o=toOctal(n);
		System.out.println(o);
	}
	static String toOctal(int x) {
		String s="";
		while(x!=0)
		{
			int r=x%8;
			s=r+s;
			x=x/8;
	}
		return s;

}
}