package com.rajhans;

public class Except3 {
	public static void main(String[] args) {
		System.out.println("start");
		int []a= {1,2,3};
		try {
			System.out.println(a[5]);
			}
		catch(Exception e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
		System.out.println("end");
	}

}
