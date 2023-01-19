package org.ragusir.programingClass;

import java.util.Scanner;

public class MainXY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String st=checkXP(n);
		System.out.println(n+" is a "+st+" number");
	}
    static String checkXP(int x) {
    	
    	int es=0,ms=0,temp=x;
    	do {
    		int r=x%10;
    		if(x<10||temp==x)
    			es=es+r;
    		else
    			ms=ms+r;
    		x=x/10;
    	}while(x!=0);
    	if(es==ms)
    	return "Xylem";
    	else
    		return "phloem";
    }
}
