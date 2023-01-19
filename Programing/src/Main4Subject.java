import java.util.Scanner;

public class Main4Subject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please provide marks of the each subjects");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int h=sc.nextInt();
		if(p<35||c<35||m<35||h<35)
			System.out.println("fail");
		else 
			System.out.println("pass");
	}

}
