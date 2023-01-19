import java.util.Scanner;

public class PrimeDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=noOfPrimeDigits(n);
		System.out.println("no of prime digit  "+count);

		}
	static int noOfPrimeDigits(int x) {
		int r=0,count=0;
		do 
		{
			r=x%10;
	    if(r==1||r==2||r==3||r==5||r==7)
		count++;
	   x=x/10;}
	   while(x!=0);
		   
	return count;
		
	}

}


