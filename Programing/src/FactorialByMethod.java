import java.util.Scanner;

public class FactorialByMethod {
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enteer");
		int n=sc.nextInt();
		int f=fact(n);
		System.out.println(f);
	}
  static int fact(int x) {
	  int mul=1;
	  for(int i=1;i<=x;i++)
		  mul=mul*i;
	  return mul;
  }
}
