package practice;

import java.util.Scanner;

public class InchToFeet {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter");
     int n=sc.nextInt();
     int d1=n/12;
     int d2=n%12;
     System.out.println(d1+" feet "+d2+" inch");
	}

}
