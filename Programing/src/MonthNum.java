import java.util.Scanner;

public class MonthNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		int m=sc.nextInt();
		if(m>=1 && m<=12 )
			System.out.println("valid month no.");
		else
			System.out.println("invalid month");

}
}