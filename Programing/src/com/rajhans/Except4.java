package com.rajhans;

public class Except4 {
	public static void main(String[] args) {
		System.out.println("start");
		int a=5;
		int b=0;
		
		try {
			System.out.println(a/b);
			}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("can not divide by zero");
		}
		finally {
			System.out.println("are you fool");
		}
		
		System.out.println("end");
	}


}
