package practice;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		int sum=0,t=n;
		do {
			
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}while(n!=0);
		if(sum==t)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
