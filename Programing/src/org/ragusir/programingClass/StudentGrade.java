package org.ragusir.programingClass;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  your 4 subjects mark");
		int p=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int b=sc.nextInt();
		if(p<35||m<35||c<35||b<35)
			System.out.println("fail");
		else {
			double per=(p+c+m+b)/4;
			if(per>=80)
				System.out.println("distinction");
			else if(per>=60)
				System.out.println("1st division");
			else if(per>=50)
				System.out.println("2nd division");
			else 
				System.out.println("pass");
		}
}
}