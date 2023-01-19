package practice;

import java.util.Scanner;

public class MainSpecial {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to check special no");
      int n=sc.nextInt();
      boolean rs=isSpecial(n);
      if(rs==true)
    	  System.out.println("yes");
      else
    	  System.out.println("no");
	}
	static boolean isSpecial(int x) {
		int d1=x%10;
		int d2=x/10;
		int sum=d1+d2+d1*d2;
		if (sum==x)
			return true;
		else 
			return false;
	}

}
