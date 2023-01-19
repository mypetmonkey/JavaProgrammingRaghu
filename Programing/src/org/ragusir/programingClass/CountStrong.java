package org.ragusir.programingClass;

public class CountStrong {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++) {
		boolean rs=isStrong(i);
		if(rs)
			System.out.println(i);
	}
}
static boolean isStrong(int x) {
	int sum=0,temp=x;
	do {
		int r=x%10;
		sum=sum+fact(r);
		x=x/10;
	}while(x!=0);
	return temp==sum;
}
static int fact(int r) {
	int f=1;
	for(int i=1;i<=r;i++) {
		f=f*i;
	}
	return f;
}
}
