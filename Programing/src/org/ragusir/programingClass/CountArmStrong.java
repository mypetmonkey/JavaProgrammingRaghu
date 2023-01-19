package org.ragusir.programingClass;

public class CountArmStrong {
	public static void main(String[] args) {
		for(int i=0;i<=1000;i++) {
			boolean rs=isArmStrong(i);
			if(rs)
				System.out.println(i);
		}
	}
  /*static boolean isArmStrong(int x) {
	  int sum=0,temp=x;
	  do {
		  int r=x%10;
		  sum=sum+r*r*r;
		  x=x/10;
	  }while(x!=0);
	  return temp==sum;
  }*/

	static boolean isArmStrong(int x) {
		int dc=countDigit(x);
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+pow(d,dc);
			 
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	
	static int pow(int x,int y) {
		int mul=1;
		while(y>0) {
			mul=mul*x;
			y--; 
		}
		return mul;
	}
	static int countDigit(int n) {
		int cnt=0;
		do {
			cnt++;
			n=n/10;
			
		}while(n!=0);
		return cnt; 
	}
}
