import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(i%2+" ");
				}
			System.out.println();
			}
			
	}    
	         
}
