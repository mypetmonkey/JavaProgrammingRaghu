import java.util.Scanner;

public class AvgOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int avg=avgOfDigits(n);
		System.out.println("average of digit  "+avg);

		}
	static int avgOfDigits(int x) {
		int sum=0,count=0;
		do {
			int r=x%10;
			sum=sum+r;
			count++;
			x=x/10;
			
		}
		while(x!=0);
		sum=sum/count;
		return sum;
		
	}

}
