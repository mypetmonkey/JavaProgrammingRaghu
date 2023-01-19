package org.ragusir.programingClass;

import java.util.Scanner;

public class MainPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if(rs)
			System.out.println("yes "+n+" is palindrome");
		else
			System.out.println("no "+n+" is not palindrome");
	}
    static boolean isPalindrome(int x) {
    	int rev=0,temp=x;
    	do {
    		int r=x%10;
    		rev=rev*10+r;
    		x=x/10;
    	}while(x!=0);
    	return rev==temp;
    }
}
