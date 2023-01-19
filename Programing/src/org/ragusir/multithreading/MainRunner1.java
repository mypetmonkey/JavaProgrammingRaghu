package org.ragusir.multithreading;

public class MainRunner1 {
	static int p=15;
	       int q=25;
	
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(p);
		
		 MainRunner1 mr=new  MainRunner1();
		 System.out.println(mr.q);
		 Sample s=new Sample();
		 System.out.println("x value is :"+s.x);
		 System.out.println("y value is :"+s.y);
		 s.x=100;
		 s.y=200;
		 Sample s1=new Sample();
		 System.out.println("x value is :"+s1.x);
		 System.out.println("y value is :"+s1.y);
		 s1.display();
		 System.out.println("main method end");
	}

}
class Sample{
	int x=10;
	static int y=20;
	public void display() {
		int a=10;
		System.out.println("a value is :"+a);
		System.out.println("x value is :"+x);
		System.out.println("y value is :"+y);
	}
	
}