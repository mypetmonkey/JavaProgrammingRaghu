import java.util.Scanner;

public class BiggestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int big=bigOfDigits(n);
		System.out.println("biggest of digit  "+big);

		}
	static int bigOfDigits(int x) {
		int big=-9,r=0;
		do {
			r=x%10;
			if(big<r)
				big=r;x=x/10;
		
			
		}
		while(x!=0);
		
		return big;
		
	}

}



