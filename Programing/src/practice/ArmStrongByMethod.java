package practice;

import java.util.Scanner;

public class ArmStrongByMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter"); 
		int n=sc.nextInt();
		boolean rs=isArmStrong(n);
		if(rs)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	static boolean isArmStrong(int x) {
		int sum=0,t=x;
		do {
			int r=x%10;
			sum=sum+r*r*r;
			x=x/10;
		}while(x!=0);
		if(sum==t)
			return true;
		else
			return false;
		
	}

}
