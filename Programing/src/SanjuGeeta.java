import java.util.Scanner;

public class SanjuGeeta {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		if(i%3==0 && i%5==0)
			System.out.println("sanju weds geeta");
		else if(i%3==0)
			System.out.println("sanju");
		else if (i%5==0)
			System.out.println("geeta");
		else
			System.out.println("breakup");
		
	}

}
