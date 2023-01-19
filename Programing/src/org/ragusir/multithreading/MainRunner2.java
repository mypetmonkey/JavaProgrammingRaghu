package org.ragusir.multithreading;

public class MainRunner2 {
    public static void main(String[] args) {
		System.out.println("main method started");
		for(int i=97;i<=107;i++) {
			System.out.println((char)i);
		}
			
		Sample1 s1=new Sample1();
		
  class MyThread1 extends Thread{
			public void run() {
				s1.display();
			}
		}
		class MyThread2 extends Thread{
			public void run() {
				s1.write();
			}
		}
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		t1.start();
		t2.start();
		System.out.println("main method end");
		System.out.println("two threads started");
		System.out.println("simultineously so mix output may appear");
	}
	
}
 class Sample1{
	 void display() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("jsp "+i);
			 if(i==5)
				 try {
					 Thread.sleep(5000);
					 
				 }catch(InterruptedException e) {
					 System.out.println(e);
				 }
		 }
	 }
	 void write() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("Qsp "+i);
		 }
	 }
	
}