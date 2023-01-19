package org.ragusir.programingClass;

import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enteer");
		int n=sc.nextInt();
		String hx=toHexadecimal(n);
		System.out.println(hx);
				
	}
	static String toHexadecimal(int x) {
		 String s="";
		 while(x!=0) {
			 int r=x%16;
			 if(r==10)
				 s="A"+s;
			 else if(r==11)
				 s="B"+s;
			 else if(r==12)
				 s="C"+s;
			 else if(r==13)
				 s="D"+s;
			 else if(r==14)
				 s="E"+s;
			 else if(r==15)
				 s="F"+s;
			 else
				 s=r+s;
			 x=x/10;
		 }
		 return s;
	}

}
