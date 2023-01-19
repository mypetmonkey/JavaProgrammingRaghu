package org.ragusir.multithreading;

public class CapitalThread extends Thread {
	public void run() {
		for(char ch='A';ch<='H';ch++) {
			System.out.println(ch);
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
class SmallThread extends Thread{
	public void run() {
		for(char ch='a';ch<='h';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class MainRunner3{
	public static void main(String[] args) {
		Thread t1=new CapitalThread();
		Thread t2=new SmallThread();
		t1.start();
		t2.start();
	}
}