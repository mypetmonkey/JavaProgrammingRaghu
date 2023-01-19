package org.ragusir.programingClass;

public class CountHappy {
public static void main(String[] args) {
	for(int i=10;i<=99;i++) {
		boolean rs=isHappy(i);
		if(rs==true) 
			System.out.println(i);
		}
}
static boolean isHappy(int x) {
	while(x>9) {
		int sum=0;
		do {
			int r=x%10;
			sum=sum+r*r;
			x=x/10;
		}while(x!=0);
		x=sum;
	}
	return x==1||x==7;
}
}
