package org.ragusir.multithreading;

public class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

}
class MainRunner5{
	public static void main(String[] args) {
		Runnable target=new MyRunnable();
		Thread t=new Thread(target);
		Thread t2=new CapitalThread();
		t.start();
		t2.start();
	}
}