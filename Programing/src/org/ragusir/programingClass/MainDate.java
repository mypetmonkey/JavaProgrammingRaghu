package org.ragusir.programingClass;

import java.util.Scanner;

public class MainDate {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter the date");
        int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||mm<1||yy<1||mm>12||dd>31)
			System.out.println("invalid");
		else if(mm==4||mm==6||mm==9||mm==11&&dd>30)
			System.out.println("invalid");
		else if(mm==2&&dd>29)
			System.out.println("invalid");
		else if(mm==2&&!(yy%400==0||yy%4==0&&yy%100!=0)&&dd>28)
			System.out.println("invalid");
		else 
			System.out.println("valid");
      
	}

}
