package com.rajhans;

public class ExceptionalEx2 {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
		System.out.println(a[5]);
	}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("out of size 3");
	}
		catch (ArithmeticException e) {
			System.out.println("out of size 2");
		}
		catch (Exception e) {
			System.out.println("out of size 1");
		}

}
}