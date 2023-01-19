import java.util.Scanner;

public class Small3Num {

public class BiggestNumELSEIF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c)
			System.out.println("smallest num  ="+a);
		else if(b<c)
			System.out.println("smallest num is  ="+b);
		else
			System.out.println("smallest num is  ="+c);
}
}
}
