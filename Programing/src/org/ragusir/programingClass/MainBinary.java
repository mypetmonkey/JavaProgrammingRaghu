package org.ragusir.programingClass;

import java.util.Scanner;

public class MainBinary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter");
	int x=s.nextInt();
	String t=toBinary(x);
	System.out.println(t);
}
static String toBinary(int x) {
	String s="";
	while(x!=0) {
	
		int r=x%2;
		s=r+s;
		x=x/2;
	}
	return s;
}
}

