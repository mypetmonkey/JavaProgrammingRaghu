package org.ragusir.programingClass;

import java.util.Scanner;

public class MainFibonacci {
	/*
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the count");
	int n=sc.nextInt();
	System.out.print(n1+" "+n2);
	getFibonacci(n-2);
	
	
}
static int n1,n2=1,n3=0;
static void getFibonacci(int n) {
	
	if(n>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		getFibonacci(n-1);
	}
}*/
/*	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the count");
int count=sc.nextInt();
  int pn=0;
  int nn=1;
  System.out.print("Fibonacci series of "+count+" number is : ");
  for(int i=1;i<=count;++i) {
	  System.out.print(pn+" ");
	  
	  int sum=pn+nn;
	  pn=nn;
	  nn=sum;
  }
	
	
	}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range upto: ");
		int n=sc.nextInt();
		System.out.print(f+" "+s);
		dofibonacci(n);
		
	}
	static int f=0,s=1,t=0;
	static void dofibonacci(int x) {
		
		while(true)
		{
			t=f+s;
			if(t>x) 
				break;
			f=s;
			s=t;
				
	System.out.print(" "+t);
			
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
