import java.util.Scanner;

public class BiggestNumELSEIF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("biggest num  ="+a);
		else if(b>c &&b>a)
			System.out.println("biggest num is  ="+b);
		else
			System.out.println("biggest num is  ="+c);
}
}