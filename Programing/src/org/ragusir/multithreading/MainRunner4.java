package org.ragusir.multithreading;

public class MainRunner4 {
	public static void main(String[] args) {
		Thread t1=new Thread();
		{
		for(char ch='a';ch<='h';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}}
		};
	
		Thread t2=new Thread();
		
		public void run() {
			for(char ch='A';ch<='H';ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		
		//t1.start();
		t2.start();
	}
}

