import java.util.Scanner;

public class DigitOrNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter please integer");
		int i=sc.nextInt();
		if(i>=-9 && i<=9)
		System.out.println("digit");
		else
			System.out.println("number");
}
}