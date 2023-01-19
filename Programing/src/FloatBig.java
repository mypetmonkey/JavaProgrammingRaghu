import java.util.Scanner;

public class FloatBig 
{
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter three number");
			float a=sc.nextFloat();
			float b=sc.nextFloat();
			float c=sc.nextFloat();
			float d=sc.nextFloat();
			if(a>b&&a>c&&a>d)
				System.out.println("biggest is   "+a);
			else if(b>c&&b>d)
				System.out.println("biggest is "+b);
			else if(c>d)
				System.out.println("biggest is "+c);
			else
				System.out.println("biggest is "+d);
}
}