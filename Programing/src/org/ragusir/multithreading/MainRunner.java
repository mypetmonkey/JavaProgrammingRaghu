package org.ragusir.multithreading;

public class MainRunner {
	int a=10;
	static int b=20;
	void display() {
		System.out.println("i am display");
	}
	public static void main(String[] args) {
		System.out.println("mms");
		System.out.println(b);
		MainRunner mr=new MainRunner();
		System.out.println(mr.a);
		mr.display();
		System.out.println("mme");
	}

}
